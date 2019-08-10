package com.example.myapplication9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class DetailActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tablayout;
    Pegawai pegawaiDetail;
    TabFragmentPagerAdapter PagerAdafter;

    @Override
protected void onCreate(Bundle savedInstanceState){
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_detail);

   tablayout = (TabLayout)findViewById(R.id.Tab_layout);
   viewPager=(ViewPager)findViewById(R.id.view_pager);
   Intent intent=getIntent();
   pegawaiDetail=(Pegawai)intent.getSerializableExtra("pegawainya");
   PagerAdafter = new  TabFragmentPagerAdapter(getSupportFragmentManager(),pegawaiDetail);
   viewPager.setAdapter(PagerAdafter);
   tablayout.setTabTextColors(getResources().getColor(R.color.colorPrimary),getResources().getColor(R.color.colortab));
   tablayout.setupWithViewPager(viewPager);
   tablayout.setTabGravity(TabLayout.GRAVITY_FILL);

    }

}

