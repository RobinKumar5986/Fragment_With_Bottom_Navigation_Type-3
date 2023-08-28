package com.example.haider.fragmentwithbottomnavigationtype_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.haider.fragmentwithbottomnavigationtype_3.Fragments.FragA;
import com.example.haider.fragmentwithbottomnavigationtype_3.Fragments.FragB;
import com.example.haider.fragmentwithbottomnavigationtype_3.Fragments.FragC;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    int c=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();


        bottomNavigationView=findViewById(R.id.bottomNavi);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.itHome){
                    fragmentHandler(new FragA(),1);
                }else if(id==R.id.itSearch){
                    fragmentHandler(new FragB(),1);
                }else{
                    fragmentHandler(new FragC(),c);
                    c++;
                    
                }
                return true;
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.itMap);
    }

    protected void fragmentHandler(Fragment fragment,int flag){
        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();

        if(flag==0) transaction.add(R.id.container ,fragment);

        else transaction.replace(R.id.container,fragment);

        transaction.commit();

    }
}