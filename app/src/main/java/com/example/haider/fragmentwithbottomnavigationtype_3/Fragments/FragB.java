package com.example.haider.fragmentwithbottomnavigationtype_3.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.haider.fragmentwithbottomnavigationtype_3.R;


public class FragB extends Fragment {
    public FragB() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_b, container, false);
    }
}