package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweFiveBinding;

public class ProgramTweFive_Fragment extends Fragment {

    FragmentProgramTweFiveBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramTweFiveBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str1 = binding.et1.getText().toString();
                String str2 = binding.et2.getText().toString();

                if (str1.isEmpty()) {
                    binding.et1.setError("Please Enter String1");
                } else if (str2.isEmpty()) {
                    binding.et2.setError("Please Enter String2");
                } else {
                    if (str1.equals(str2)) {
                        binding.tvResult.setText("Both String are Equal");
                    } else {

                        binding.tvResult.setText("Both String are Not Equal");
                    }
                }
            }
        });
    }
}