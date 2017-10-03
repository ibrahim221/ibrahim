package com.example.dd.fragmentexample;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView baensFragment,braedFragment,chapatifragment,fantoFragment,limofragment,kharefragment,spritefragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the reference of Button's



       baensFragment= (TextView) findViewById(R.id.baensFragment);
        braedFragment= (TextView) findViewById(R.id.braedFragment);
        chapatifragment= (TextView) findViewById(R.id.chapatifragment);
        fantoFragment= (TextView) findViewById(R.id.fantoFragment);
       limofragment= (TextView) findViewById(R.id.limoFragment);
        kharefragment= (TextView) findViewById(R.id.khareFragment);
        spritefragment= (TextView) findViewById(R.id.spriteFragment);






        baensFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new baensFragment());
            }
        });
        braedFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new braedFragment());
            }
        });
        chapatifragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new braedFragment());
            }
        });


        fantoFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new fantoFragment());
            }
        });
        limofragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new limoFragment());
            }
        });
        kharefragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new kharefragment());
            }
        });
        spritefragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
// load Second Fragment
                loadFragment(new spritefragment());
            }
        });


    }



    private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit(); // save the changes
    }
}