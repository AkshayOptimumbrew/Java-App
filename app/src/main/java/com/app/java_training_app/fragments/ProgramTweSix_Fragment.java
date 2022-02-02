package com.app.java_training_app.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweSixBinding;

public class ProgramTweSix_Fragment extends Fragment {

    FragmentProgramTweSixBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramTweSixBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                int ascii;
                String str = binding.etString.getText().toString();
                if (str.isEmpty()) {
                    binding.etString.setError("Please Enter String");
                } else {
                    for (int i = 0; i < str.length(); i++) {
                        ascii = str.charAt(i);

                        if (ascii % 2 == 0) {
                            String s1 = "Even:" + str.charAt(i) + "=" + ascii + "\n";
                            binding.tvResult.append(s1);
                        } else {
                            String s2 = "Odd:" + str.charAt(i) + "=" + ascii + "\n";
                            binding.tvResult.append(s2);
                        }
                    }
                }
            }
        });

    }
}