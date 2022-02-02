package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramFiveBinding;


public class ProgramFive_Fragment extends Fragment {

    FragmentProgramFiveBinding binding;
    int n;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramFiveBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                int a, b = 1, c = 0;
                String str = binding.etNumber.getText().toString();
                if (str.isEmpty()) {
                    binding.etNumber.setError("Please Enter Number");
                } else {
                    int n = Integer.valueOf(str);
                    for (int i = 1; i <= n; i++) {
                        a = b;
                        b = c;
                        c = a + b;
                        for (int j = 1; j <= n; j++) {
                            if (j <= n - i) {
                                binding.tvResult.append(String.valueOf(c));
                                System.out.print(c);

                            } else {
                                binding.tvResult.append("");
                            }
                        }
                        binding.tvResult.append("\n");
                    }
                }
            }
        });
    }
}