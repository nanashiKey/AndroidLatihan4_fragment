package com.ngopidev.project.androidlatihan4_fragment;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import com.ngopidev.project.androidlatihan4_fragment.allfragments.Kedua;
import com.ngopidev.project.androidlatihan4_fragment.allfragments.Keempat;
import com.ngopidev.project.androidlatihan4_fragment.allfragments.Kelima;
import com.ngopidev.project.androidlatihan4_fragment.allfragments.Ketiga;
import com.ngopidev.project.androidlatihan4_fragment.allfragments.Pertama;


/**
 * created by Irfan Assidiq on 2019-05-19
 * email : assidiq.irfan@gmail.com
 **/
public class NavBottomAdapter extends FragmentPagerAdapter {
    final int RG = 5;
    private Fragment currentFragment;

    public NavBottomAdapter(FragmentManager fm) { super(fm); }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0:{
                currentFragment = Pertama.newInstance(0);
            }break;
            case 1:{
                currentFragment = Kedua.newInstance(1);
            }break;
            case 2:{
                currentFragment= Ketiga.newInstance(2);
            }break;
            case 3:{
                currentFragment = Keempat.newInstance(3);
            }break;
            case 4:{
                currentFragment = Kelima.newInstance(4);
            }
        }
        return currentFragment;
    }

    @Override
    public int getCount() {
        return RG;
    }

    @Override
    public void setPrimaryItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.setPrimaryItem(container, position, object);
    }
    public Fragment getCurrentFragment(){return currentFragment;}
}
