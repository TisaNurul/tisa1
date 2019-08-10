package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    EditText edtnama,edtalamat,edtnohp,edtkerj,edtlamakerja,edtasalsekolah,edtkompetensi;
    Button btninput;
    Pegawai pegawai;
    String namanya,alamatnya,nohpnya,pekerjaaanya,lamakerjanya,asalsekolahnya,kompetensinya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtnama=(EditText)findViewById(R.id.edt_nama);
        edtalamat=(EditText)findViewById(R.id.edt_alamat);
        edtnohp=(EditText)findViewById(R.id.edt_nohp);
        edtkerj=(EditText)findViewById(R.id.edt_pekerjaan);
        edtlamakerja=(EditText)findViewById(R.id.edt_lamakerja);
        edtasalsekolah=(EditText)findViewById(R.id.edt_asalsekolah);
        edtkompetensi=(EditText)findViewById(R.id.edt_kompetensi);
        btninput=(Button)findViewById(R.id.btn_input);
        btninput=(Button)findViewById(R.id.btn_input);
        btninput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                namanya=edtnama.getText().toString();
                alamatnya=edtalamat.getText().toString();
                nohpnya=edtnohp.getText().toString();
                pekerjaaanya=edtkerj.getText().toString();
                lamakerjanya=edtlamakerja.getText().toString();
                asalsekolahnya=edtasalsekolah.getText().toString();
                kompetensinya=edtkompetensi.getText().toString();
                pegawai=new Pegawai(namanya,alamatnya,nohpnya,pekerjaaanya,lamakerjanya,asalsekolahnya,kompetensinya);
                Intent lempar = new Intent(MainActivity.this,DetailActivity.class);
                lempar.putExtra("pegawainya",(Serializable)pegawai);
                startActivity(lempar);
            }
        });
    }
}
