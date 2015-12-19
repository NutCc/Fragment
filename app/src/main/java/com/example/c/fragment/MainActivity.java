package com.example.c.fragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //很不懂为什么要new两次
        AnotherRightFragment fragment=new AnotherRightFragment();
        FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction transaction=fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout, fragment);
        transaction.commit();
        //
        Button button= (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        Button button2= (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        Button button3= (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                AnotherRightFragment fragment=new AnotherRightFragment();
                FragmentManager fragmentManager=getFragmentManager();
                FragmentTransaction transaction=fragmentManager.beginTransaction();
                transaction.replace(R.id.right_layout, fragment);
                transaction.commit();
                break;
            case R.id.button2:
               ZLeftFragment fragment2=new ZLeftFragment();
                FragmentManager fragmentManager2=getFragmentManager();
                FragmentTransaction transaction2=fragmentManager2.beginTransaction();
                transaction2.replace(R.id.right_layout, fragment2);
                transaction2.commit();
                break;
            case R.id.button3:
                ZRightFragment fragment3=new ZRightFragment();
                FragmentManager fragmentManager3=getFragmentManager();
                FragmentTransaction transaction3=fragmentManager3.beginTransaction();
                transaction3.replace(R.id.right_layout,fragment3);
                transaction3.commit();
        }
    }
}
