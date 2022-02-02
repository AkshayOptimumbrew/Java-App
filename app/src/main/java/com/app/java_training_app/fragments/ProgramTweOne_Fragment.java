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
import com.app.java_training_app.databinding.FragmentProgramTweOneBinding;
import com.app.java_training_app.databinding.FragmentProgramTwentyBinding;

public class ProgramTweOne_Fragment extends Fragment {

    FragmentProgramTweOneBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentProgramTweOneBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str;
                int letter = 0, digit = 0, space = 0, other = 0, decimal = 0, word = 0;

                str = binding.etString.getText().toString();
                if (str.isEmpty()) {
                    binding.etString.setError("Please Enter Number");
                } else {
                    char[] ch = str.toCharArray();

                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
                            word++;
                        }
                        if (Character.isSpaceChar(ch[i])) {
                            space++;
                        } else if (Character.isLetter(ch[i])) {
                            letter++;
                        } else if (Character.isDigit(ch[i])) {
                            digit++;
                        } else if (str.charAt(i) == '.') {
                            decimal++;
                        } else {
                            other++;
                        }
                    }
                    binding.tvResult.setText("Total Letter:" + letter + "\n" + "Total Digit:" + digit +
                            "\n" + "Total Space:" + space +
                            "\n" + "Total Other:" + other +
                            "\n" + "Total Decimal:" + decimal +
                            "\n" + "Total Word:" + word);
                }
            }
        });
    }
}