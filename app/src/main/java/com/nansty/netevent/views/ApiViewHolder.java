package com.nansty.netevent.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;

import java.lang.ref.WeakReference;

import butterknife.BindView;
import butterknife.ButterKnife;
import com.nansty.netevent.R;
import com.nansty.netevent.models.LolSerie;

public class ApiViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    @BindView(R.id.fragment_main_item_title) TextView textView;
    @BindView(R.id.fragment_main_item_website) TextView textViewWebSite;
    @BindView(R.id.fragment_main_item_image) ImageView imageView;
    @BindView(R.id.fragment_main_item_delete) ImageButton imageButton;

    //
    private WeakReference<ApiSerieAdapter.Listener> callbackWeakRef;

    public ApiViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void updateWithLolSerie(LolSerie lolSerie, RequestManager glide, ApiSerieAdapter.Listener callback){
        this.textView.setText(lolSerie.getSlug());
        //
        this.imageButton.setOnClickListener(this);
        //
        this.callbackWeakRef = new WeakReference<ApiSerieAdapter.Listener>(callback);

        glide.load(lolSerie.league.getImageUrl()).apply(RequestOptions.circleCropTransform()).into(imageView);
    }

    @Override
    public void onClick(View view) {
        //Quand un click se déclenche, we retire notre listener.
        ApiSerieAdapter.Listener callback = callbackWeakRef.get();
        if (callback != null) callback.onClickDeleteButton(getAdapterPosition());
    }
}
