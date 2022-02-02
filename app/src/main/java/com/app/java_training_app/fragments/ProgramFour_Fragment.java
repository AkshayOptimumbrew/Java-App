package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramFourBinding;

public class ProgramFour_Fragment extends Fragment {

    FragmentProgramFourBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentProgramFourBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");

                String str=binding.etNumber.getText().toString();
                if(str.isEmpty()){
                    binding.etNumber.setError("Please Enter Number");
                }else {
                    int n = Integer.valueOf(str);
                    int k = 1;
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n; j++) {
                            if (j <= i) {
                                binding.tvResult.append(String.valueOf(k));
                                System.out.print(k);
                                k++;
                            } else {
                                binding.tvResult.append(" ");
                                System.out.print(" ");
                            }
                        }
                        binding.tvResult.append("\n");
                        System.out.print("\n");
                    }
                }
            }
        });
    }
}