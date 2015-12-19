package com.example.c.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by c on 2015/12/17.
 */
public class RightFragment extends Fragment{
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_right,container,false);
        return view;
    }
}
