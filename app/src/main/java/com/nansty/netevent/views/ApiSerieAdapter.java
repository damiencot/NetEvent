package com.nansty.netevent.views;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.RequestManager;

import java.util.List;

import com.nansty.netevent.R;
import com.nansty.netevent.models.LolSerie;

public class ApiSerieAdapter extends RecyclerView.Adapter<ApiViewHolder> {

    // DATA
    private List<LolSerie> lolSeries;

    private RequestManager glide;

    //
    public interface Listener{
        void onClickDeleteButton(int position);
    }

    //
    private final Listener callback;

    // CONSTRUCTOR
    public ApiSerieAdapter(List<LolSerie> lolSeries, RequestManager glide, Listener callback){
        this.lolSeries = lolSeries;
        this.glide = glide;
        //3
        this.callback = callback;
    }

    @Override
    public ApiViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.fragment_main_item, parent, false);

        return new ApiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ApiViewHolder holder, int position) {
        holder.updateWithLolSerie(this.lolSeries.get(position), this.glide, this.callback);
    }

    @Override
    public int getItemCount() {
        return this.lolSeries.size();
    }

    public LolSerie getLolSerie(int position){
        return this.lolSeries.get(position);
    }
}
