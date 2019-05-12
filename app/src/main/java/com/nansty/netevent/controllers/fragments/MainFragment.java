package com.nansty.netevent.controllers.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.nansty.netevent.R;
import com.nansty.netevent.models.LolSerie;
import com.nansty.netevent.utils.ApiStreams;
import com.nansty.netevent.utils.ItemClickSupport;
import com.nansty.netevent.views.ApiSerieAdapter;
import io.reactivex.disposables.Disposable;
import io.reactivex.observers.DisposableObserver;


public class MainFragment extends Fragment implements ApiSerieAdapter.Listener {

    // DESIGN
    // Declare RecyclerView
    //@BindView(R.id.fragment_main_textview) TextView textView;
    @BindView(R.id.fragment_main_recycler_view) RecyclerView recyclerView;
    //On déclare notre SwipeRefreshLayout.
    @BindView(R.id.fragment_swipe_container) SwipeRefreshLayout swipeRefreshLayout;

    //DATA

    // Cette variable correspond à la souscription du Subscriber à l'Observable
    // Celle-ci nous permettra de nous désinscrire facilement
    // de l'Observable lorsque nous souhaiterons ne plus recevoir son émission de données.
    private Disposable disposable;
    // Declare List of Lol Serie & Adapter
    private List<LolSerie> lolSeries;
    private ApiSerieAdapter adapter;

    public MainFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate le layout pour le fragment
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        this.configureRecyclerView();
        this.configureSwipeRefreshLayout();
        this.configureOnclickRecyclerView();
        this.executeHttpRequestWithRetrofit();
        return view;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        this.disposeWhenDestroy();
    }

    // ------------------
    //  ACTIONS
    // ------------------


    /*
    @OnClick(R.id.fragment_main_button)
    public void submit(View view) {
        this.executeHttpRequestWithRetrofit();
    }
    */


    @Override
    public void onClickDeleteButton(int position) {
        LolSerie serie = adapter.getLolSerie(position);
        Toast.makeText(getContext(), "You are trying to delete : "+serie.getName(), Toast.LENGTH_SHORT).show();
    }

    // ---------------
    //  Configuration
    // ---------------

    private void configureRecyclerView(){
        this.lolSeries = new ArrayList<>();

        this.adapter = new ApiSerieAdapter(this.lolSeries, Glide.with(this), this);

        this.recyclerView.setAdapter(this.adapter);

        this.recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    }

    // Configure le SwipeRefreshLayout
    private void configureSwipeRefreshLayout(){
        //Ce dernier sera lancé quand l'utilisateur
        // exécutera un "Pull To Refresh" et déclenchera la méthode  onRefresh()
        // qui elle lancera notre stream habituelle.
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                executeHttpRequestWithRetrofit();
            }
        });
    }

    private void configureOnclickRecyclerView(){
        ItemClickSupport.addTo(recyclerView, R.layout.fragment_main_item).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Log.e("TAG", "Position : "+position);
                LolSerie lolSerie = adapter.getLolSerie(position);

                Toast.makeText(getContext(), "Cliquer sur : "+lolSerie.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    // -------------
    //  Reactive X
    // -------------


    // Désinscrire l'Observable quand le fragment est détruit
    private void disposeWhenDestroy(){
        if (this.disposable != null && !this.disposable.isDisposed()){
            this.disposable.dispose();
        }
    }


    // ----------------------
    //  HTTP (RxJAVA)
    // ----------------------


    // Execute HTTP request et update UI
    private void executeHttpRequestWithRetrofit(){
        // Update UI
        //this.updateUIWhenStartingHTTPRequest();
        // Appelons depuis la classe ApiStreams notre Observable qui va émettre les données JSON récupérées depuis l'API
        // Nous y souscrivons en créant un Subscriber (DisposableObserver) et en plaçant la souscription générée dans la variable de classe  this.disposable
        this.disposable = ApiStreams.streamFetchSerieFollowing("lol").subscribeWith(new DisposableObserver<List<LolSerie>>() {
            @Override
            public void onNext(List<LolSerie> series) {
                Log.e("TAG","On Next");
                // 1.3 - Update UI avec la listes des series
                updateUI(series);
            }

            @Override
            public void onError(Throwable e) {
                Log.e("TAG","On Error"+Log.getStackTraceString(e));
            }

            @Override
            public void onComplete() {
                Log.e("TAG","On Complete !!");
            }
        });
    }



    // ------------------
    //  UPDATE UI
    // ------------------
    /*
    private void updateUIWhenStartingHTTPRequest(){
        this.textView.setText("Downloading...");
    }

    private void updateUIWhenStopingHTTPRequest(String response){
        this.textView.setText(response);
    }

    //Mise à jour de l'interface (affichant uniquement le nom du concours)
    private void updateUIWithListOfSerie(List<LolSerie> series){
        StringBuilder stringBuilder = new StringBuilder();
        for (LolSerie serie : series){
            stringBuilder.append("-"+serie.getSlug());
        }
        updateUIWhenStopingHTTPRequest(stringBuilder.toString());
    }
    */
    private void updateUI(List<LolSerie> series){
        //notre requête réseau s'est correctement terminée (  setRefreshing(false)  )
        swipeRefreshLayout.setRefreshing(false);
        //on efface à chaque fois complètement la précédente liste de series
        lolSeries.clear();
        lolSeries.addAll(series);
        adapter.notifyDataSetChanged();
    }

}
