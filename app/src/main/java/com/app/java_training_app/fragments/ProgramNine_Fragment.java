package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramNineBinding;

public class ProgramNine_Fragment extends Fragment {

    FragmentProgramNineBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramNineBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                String str = binding.etNumber.getText().toString();
                if (str.isEmpty()) {
                    binding.etNumber.setError("Please Enter Number");
                } else {
                    int n = Integer.parseInt(str);
                    for (int i = n; i >= 1; i--) {
                        for (int j = n; j > i; j--) { // print space
                            binding.tvResult.append(" ");
                        }
                        for (int k = 1; k < 2 * i; k++) {
                            if (i == n || (k == 1 || k == 2 * i - 1)) binding.tvResult.append("*");
                            else binding.tvResult.append(" ");
                        }
                        binding.tvResult.append("\n");
                    }
                    for (int l = 1; l <= n * 2; l++) binding.tvResult.append("*");

                }
            }
        });
    }
}