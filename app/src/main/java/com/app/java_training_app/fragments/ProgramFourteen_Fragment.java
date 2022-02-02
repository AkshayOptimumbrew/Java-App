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
import com.app.java_training_app.databinding.FragmentProgramFourteenBinding;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ProgramFourteen_Fragment extends Fragment {

    FragmentProgramFourteenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramFourteenBinding.inflate(inflater,container,false);
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
                    Map<Character, Integer> baseMap = new HashMap<>();
                    char[] charArray = str.toCharArray();
                    for (Character ch : charArray) {
                        if (baseMap.containsKey(ch)) {
                            baseMap.put(ch, baseMap.get(ch) + 1);
                        } else {
                            baseMap.put(ch, 1);
                        }
                    }
                    Set<Character> keys = baseMap.keySet();
                    for (Character ch : keys) {
                        if (baseMap.get(ch) > 1) {
                            binding.tvResult.append(String.valueOf(ch + "-" + baseMap.get(ch)) + "\n");
                            System.out.println(ch + "-" + baseMap.get(ch));
                        }
                    }
                }
            }
        });
    }
}