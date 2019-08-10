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
public class FragmentJob extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainyaa;
    private TextView txtNama2 ,txtPekerjaan,txtLamaKerja;


    public FragmentJob() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bundle = getArguments();
        pegawainyaa = (Pegawai) bundle.getSerializable("bungkus2");
    }
    @Override
    public View onCreateView(LayoutInflater Inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = Inflater.inflate(R.layout.fragment_fragment_job, container, false);
        txtNama2= (TextView)view2.findViewById(R.id.txt_Namajob);
        txtPekerjaan = (TextView)view2.findViewById(R.id.txt_perkerjaan);
        txtLamaKerja = (TextView)view2.findViewById(R.id.txt_lamakerja);
        return view2;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama2.setText(pegawainyaa.getNama());
        txtPekerjaan.setText(pegawainyaa.getPekerjaan());
        txtLamaKerja.setText(pegawainyaa.getLamakerja());

    }
}





