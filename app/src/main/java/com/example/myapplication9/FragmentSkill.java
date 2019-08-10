package com.example.myapplication9;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSkill extends Fragment {

    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama,txtAsalSekolah,txtKopetensi;


    public FragmentSkill() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        pegawainya = (Pegawai) bundle.getSerializable("bungkus3");
    }
    @Override
    public View onCreateView(LayoutInflater Inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = Inflater.inflate(R.layout.fragment_fragment_skill, container, false);
        txtNama= (TextView)view2.findViewById(R.id.txt_nama);
        txtAsalSekolah = (TextView)view2.findViewById(R.id.txt_asalsekolah);
        txtKopetensi = (TextView)view2.findViewById(R.id.txt_kompetensi);
        return view2;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawainya.getNama());
        txtAsalSekolah.setText(pegawainya.getAsalsekolah());
        txtKopetensi.setText(pegawainya.getKompetensi());

    }
}








