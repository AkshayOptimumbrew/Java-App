package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramEightBinding;

public class ProgramEight_Fragment extends Fragment {

    FragmentProgramEightBinding binding;
    String str;
    String s1, s2, s3, s4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramEightBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tv1.setText("");
                str = binding.etString.getText().toString();
                if (str.isEmpty()) {
                    binding.etString.setError("Please Enter Number");
                } else {
                    boolean b = false;
                    if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
                        b = str.chars().allMatch(Character::isDigit);
                    }

                    for (int i = 0; i < str.length(); i++) {
                        if (b) {
                            s1 = str.charAt(i) + "!";
                            binding.tv1.append(s1);
                        } else if (str.charAt(i) == ' ') {
                            s2 = "-";
                            binding.tv1.append(s2);
                        } else {
                            if (i % 2 == 0) {
                                s3 = str.charAt(i) + "*";
                                binding.tv1.append(s3);
                            } else {
                                s4 = str.charAt(i) + "%";
                                binding.tv1.append(s4);
                            }
                        }
                    }
                    binding.tv1.append(s1 + s2 + s3 + s4);
                }
            }
        });
    }
}