package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramSizBinding;


public class ProgramSiz_Fragment extends Fragment {


    FragmentProgramSizBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramSizBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                int a = 0, b = 0;
                String str = binding.etString.getText().toString();
                if (str.isEmpty()) {
                    binding.etString.setError("Please Enter String");
                } else {
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ' ') {
                            a++;
                        }
                        if (str.charAt(i) != ' ') {
                            b++;
                        }
                    }
                    String num = String.valueOf(a + b);
                    binding.tvResult.append("Total Character::" + num);
                }
            }
        });
    }
}