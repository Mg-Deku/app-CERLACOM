package com.miguel.app_cerlacom;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.miguel.app_cerlacom.Fragmentos.Fragmento_Inicio;
import com.miguel.app_cerlacom.Fragmentos.Fragmento_Perfil;
import com.miguel.app_cerlacom.adaptador.ViewPageAdapter;

public class Principal extends AppCompatActivity {

    private ViewPager ViewPager;
    private TabLayout TabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TabLayout = (TabLayout) findViewById(R.id.tablayout);
        ViewPager = (ViewPager) findViewById(R.id.view_parger);
        ViewPageAdapter adaptador = new ViewPageAdapter(getSupportFragmentManager());
        adaptador.AddFragment(new Fragmento_Inicio());
        adaptador.AddFragment(new Fragmento_Perfil());

        ViewPager.setAdapter(adaptador);
        ViewPager.setOffscreenPageLimit(2);

        TabLayout.setupWithViewPager(ViewPager);

        TabLayout.getTabAt(0).setText("Inicio");
        TabLayout.getTabAt(1).setText("Perfil");

    }
}