package com.example.myapplication9;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {
    String[]judul=new  String[]{"personal","job","skill"};
    Pegawai objpegawai;

    public TabFragmentPagerAdapter(FragmentManager fm,Pegawai objpegawai){
        super(fm);
        this.objpegawai=objpegawai;
    }
    @Override
    public Fragment getItem(int i){
        switch (i){
            case 0:
                Fragment fragmentPersonal=new FragmentPersonal();
               Bundle bungkus=new Bundle();
                bungkus.putSerializable("bungkus1",objpegawai);
                fragmentPersonal.setArguments(bungkus);
                return fragmentPersonal;
            case 1:
                Fragment fragmentJobs = new FragmentJob();
                Bundle bungkus2 = new Bundle();
                bungkus2.putSerializable("bungkus2",objpegawai);
                fragmentJobs.setArguments(bungkus2);
                return fragmentJobs;
            case 2:
                Fragment fragmentSkill = new FragmentSkill();
                Bundle bungkus3 = new Bundle();
                bungkus3.putSerializable("bungkus3",objpegawai);
                fragmentSkill.setArguments(bungkus3);
                return fragmentSkill;

        }
        return null;

    }
    @Override
    public  int getCount(){
        return judul.length;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return judul[position];
    }
    }




