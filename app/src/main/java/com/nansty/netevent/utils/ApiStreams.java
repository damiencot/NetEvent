package com.nansty.netevent.utils;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.nansty.netevent.models.LolSerie;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/*
 * Liste tous les streams relatifs à API
 */
public class ApiStreams {


    public static Observable<List<LolSerie>> streamFetchSerieFollowing(String game){
        ApiService apiService = ApiService.retrofit.create(ApiService.class);
        return apiService.getFollowing(game)
                //Cet opérateur très utilisé sur Android va nous permettre d'exécuter l'Observable dans un Thread dédié (Schedulers.io)
                .subscribeOn(Schedulers.io())
                //Permets de dire à tous les Subscribers d'écouter le flux de données de l'Observable sur le Thread Principal (AndroidSchedulers.mainThread)
                .observeOn(AndroidSchedulers.mainThread())
                //Si ce dernier n'a pas émis de données avant le temps définies (ici 10 secondes), l'émission de données sera coupée et une erreur de type Timeout sera envoyée au(x) Subscriber(s) via leur méthode  onError()
                .timeout(10, TimeUnit.SECONDS);
    }

}
