package com.nansty.netevent.views;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.nansty.netevent.controllers.fragments.PageFragment;

public class PageAdapter extends FragmentPagerAdapter {

    //Array de colors qui sera passé a PageFragment
    private int[] colors;

    //Defaut Constructor
    public PageAdapter(FragmentManager mgr) {
        super(mgr);
    }

    @Override
    public int getCount() {
        return(3); //Nombre de page à l'affichage
    }

    @Override
    public Fragment getItem(int position) {
        //Page de retour
        return(PageFragment.newInstance(position));
        /*
        switch (position){
            case 0:
                return
        }
        */
    }
}

