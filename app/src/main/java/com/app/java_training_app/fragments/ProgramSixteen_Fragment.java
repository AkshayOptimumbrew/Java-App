package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramSixteenBinding;


public class ProgramSixteen_Fragment extends Fragment {

    FragmentProgramSixteenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramSixteenBinding.inflate(inflater,container,false);
        return  binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                String str = binding.etString.getText().toString();

                if (str.isEmpty()) {
                    binding.etString.setError("Please Enter Number");
                } else {
                    StringBuilder builder = new StringBuilder(str);
                    builder.reverse();


                    String[] s = builder.toString().split(" ");


                    for (String m : s) {
                        binding.tvResult.append(m);
                    }
                }
            }
        });
    }
}