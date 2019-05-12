package com.nansty.netevent.controllers.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nansty.netevent.R;

public class PageFragment extends Fragment {

    //Création d'une clé pour notre Bundle
    private static final String KEY_POSITION="position";
    private static final String KEY_COLOR="color";


    public PageFragment() { }


    // La Method  va crée une nouvelle instance de PageFragment, et ajouté les données à son bundle.
    public static PageFragment newInstance(int position) {

        // Crée un nouveau fragment
        PageFragment frag = new PageFragment();

        // Crée un bundle et ajoute des données
        Bundle args = new Bundle();
        args.putInt(KEY_POSITION, position);
        frag.setArguments(args);

        return(frag);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Récupère le layout de PageFragment
        View result = inflater.inflate(R.layout.fragment_page, container, false);

        //Récupère widgets de layout et je le serialise
        LinearLayout rootView= (LinearLayout) result.findViewById(R.id.fragment_page_rootview);
        TextView textView= (TextView) result.findViewById(R.id.fragment_page_title);

        //Récupère les données de Bundle (créé dans la méthode newInstance)
        int position = getArguments().getInt(KEY_POSITION, -1);

        // Update widgets avec les données
        textView.setText("Page numéro "+position);

        Log.e(getClass().getSimpleName(), "onCreateView called for fragment number "+position);

        return result;
    }

}
