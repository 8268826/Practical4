package com.vantuan.practical4;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class BlankFragment extends Fragment {



    View mView;
    Button btn_frag1;
    Button btn_frag2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mView = inflater.inflate(R.layout.fragment_blank, container, false);
        btn_frag1 = mView.findViewById(R.id.btn_frag1);
        btn_frag2 = mView.findViewById(R.id.btn_frag2);
        btn_frag1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
        btn_frag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(requireContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
        return mView;
    }
}