package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTenBinding;


public class ProgramTen_Fragment extends Fragment {

    FragmentProgramTenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramTenBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                for(int i=1;i<=5;i++) {
                    for (int j = 1; j <= 5; j++) {
                        if (i == j) binding.tvResult.append("*");
                        else binding.tvResult.append(" ");
                    }
                    binding.tvResult.append("\n");
                }
                for(int i=1;i<=4;i++){
                    for(int j=1;j<=5;j++){
                        if(j-i==1||j==1) binding.tvResult.append("  *");
                        else binding.tvResult.append(" ");
                    }
                    binding.tvResult.append("\n");
                }
                binding.tvResult.append("\n");
            }
        });
    }
}