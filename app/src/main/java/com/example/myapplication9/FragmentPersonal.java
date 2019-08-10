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
public class FragmentPersonal extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainya;
    private TextView txtNama,txtAlamat,txtNoHp;


    public FragmentPersonal() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        pegawainya = (Pegawai) bundle.getSerializable("bungkus1");
    }
    @Override
    public View onCreateView(LayoutInflater Inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View view2 = Inflater.inflate(R.layout.fragment_fragment_personal2, container, false);
        txtNama= (TextView)view2.findViewById(R.id.txt_nama);
        txtAlamat = (TextView)view2.findViewById(R.id.txt_alamat);
        txtNoHp = (TextView)view2.findViewById(R.id.txt_nohp);
        return view2;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama.setText(pegawainya.getNama());
        txtAlamat.setText(pegawainya.getAlamat());
        txtNoHp.setText(pegawainya.getNohp());

    }
}




