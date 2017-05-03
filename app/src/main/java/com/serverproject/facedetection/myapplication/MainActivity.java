package com.serverproject.facedetection.myapplication;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn1,btn2;
    Fragment fr1,fr2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();

        // get the display mode
        int displaymode = getResources().getConfiguration().orientation;
        if (displaymode == 1) { // it portrait mode
            fragment1 f1 = new fragment1();
            fragmentTransaction.replace(android.R.id.content, f1);
        } else {// its landscape
            fragment2 f2 = new fragment2();
            fragmentTransaction.replace(android.R.id.content, f2);
        }
        fragmentTransaction.commit();




    }


}
