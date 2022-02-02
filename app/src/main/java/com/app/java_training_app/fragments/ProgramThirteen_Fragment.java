package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramThirteenBinding;
public class ProgramThirteen_Fragment extends Fragment {

    FragmentProgramThirteenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramThirteenBinding.inflate(inflater,container,false);
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

                    for (int i = 1; i <= n; i++) {

                        int k = n;
                        int a = n + 1;
                        int b = n - 1;

                        for (int j = 1; j <= n; j++) {
                            if (i == n || i == 1 || j == 1) {
                                binding.tvResult.append("- ");
                            } else if (((a - k) == j) && b == j) {
                                String format = String.format("%" + n + "s", "-");
                                binding.tvResult.append(format);
                            } else {
                                binding.tvResult.append(" ");
                            }
                            k--;
                        }
                        binding.tvResult.append("\n");
                    }
                }
            }
        });
    }
}