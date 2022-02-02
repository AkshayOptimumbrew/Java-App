package com.app.java_training_app.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.text.InputType;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweEightBinding;

import java.util.ArrayList;


public class ProgramTweEight_Fragment extends Fragment {

    FragmentProgramTweEightBinding binding;
    ArrayList<Integer> list;
    EditText etTotalArray;
    String TAG="fragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramTweEightBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @SuppressLint("ResourceType")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        list=new ArrayList<>();

        binding.btnEnter.setVisibility(View.GONE);
        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {

                String str = binding.etNumber.getText().toString();
                int n = Integer.parseInt(str);

                binding.root2.removeAllViews();

                for (int i = 0; i < n; ++i) {

                    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                            android.widget.LinearLayout.LayoutParams.MATCH_PARENT,
                            android.widget.LinearLayout.LayoutParams.WRAP_CONTENT);

                    etTotalArray = new EditText(getActivity());

                    etTotalArray.setId(i);
                    etTotalArray.setInputType(InputType.TYPE_CLASS_NUMBER);
                    etTotalArray.setLayoutParams(params);
                    etTotalArray.setHint("Enter Array "+i+" Size");
                    binding.root2.addView(etTotalArray);
                }
                binding.btnEnter.setVisibility(View.VISIBLE);

                Log.i(TAG, "onClick: "+etTotalArray.getId());


            }
        });

        binding.btnEnter.setOnClickListener(v1 -> {
            if(etTotalArray.getId()==0){
                String str0=etTotalArray.getText().toString().trim();
                int n0=Integer.parseInt(str0);

                list.add(n0);
            }
            if(etTotalArray.getId()==1){
                String str1=etTotalArray.getText().toString().trim();
                int n1=Integer.parseInt(str1);

                list.add(n1);
            }
            if(etTotalArray.getId()==2){
                String str2=etTotalArray.getText().toString().trim();
                int n2=Integer.parseInt(str2);

                list.add(n2);
            }
            Log.i(TAG, "Size: "+list.size());
        });
    }


}
