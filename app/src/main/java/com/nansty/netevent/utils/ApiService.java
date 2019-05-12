package com.nansty.netevent.utils;

import java.util.List;

import com.nansty.netevent.models.LolSerie;
import io.reactivex.Observable;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {


    //ow/tournaments}
    //ow/tournaments.json?token=LlLufAuCOgGMZX4Gft13ZYkexa9eCo_iX1_cUSOxHFMaxjHk7uA
    @GET("{game}/tournaments.json?token=LlLufAuCOgGMZX4Gft13ZYkexa9eCo_iX1_cUSOxHFMaxjHk7uA")
    Observable<List<LolSerie>> getFollowing(@Path("game") String game);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://api.pandascore.co/").addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build();

}
