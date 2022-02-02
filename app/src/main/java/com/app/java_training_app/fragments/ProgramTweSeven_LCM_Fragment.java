package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweSevenLCMBinding;


public class ProgramTweSeven_LCM_Fragment extends Fragment {

    FragmentProgramTweSevenLCMBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding=FragmentProgramTweSevenLCMBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnPress.setOnClickListener(v -> {
            binding.tvResult.setText("");

            //TODO For Rows
            int lcm_0_row = 0, n00, n01, n02, flag_0_row = 0;
            int lcm_1_row = 0, n10, n11, n12, flag_1_row = 0;
            int lcm_2_row = 0, n20, n21, n22, flag_2_row = 0;
            int num1, num2, num3, num4, num5, num6, num7, num8, num9;
            int max;
            //TODO For Cols
            int lcm_O_cols = 0, c00, c10, c20, flag_0_cols = 0;
            int lcm_1_cols = 0, c01, c11, c21, flag_1_cols = 0;
            int lcm_2_cols = 0, c02, c12, c22, flag_2_cols = 0;

            String str1 = binding.et1.getText().toString();
            String str2 = binding.et2.getText().toString();
            String str3 = binding.et3.getText().toString();
            String str4 = binding.et4.getText().toString();
            String str5 = binding.et5.getText().toString();
            String str6 = binding.et6.getText().toString();
            String str7 = binding.et7.getText().toString();
            String str8 = binding.et8.getText().toString();
            String str9 = binding.et9.getText().toString();

            if (str1.isEmpty() && str2.isEmpty() && str2.isEmpty() && str3.isEmpty()
                    && str4.isEmpty() && str5.isEmpty() && str6.isEmpty() && str7.isEmpty()
                    && str8.isEmpty() && str9.isEmpty()) {
                Toast.makeText(getActivity(), "Please Enter All Field", Toast.LENGTH_SHORT).show();
            }else {

                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                num3 = Integer.parseInt(str3);
                num4 = Integer.parseInt(str4);
                num5 = Integer.parseInt(str5);
                num6 = Integer.parseInt(str6);
                num7 = Integer.parseInt(str7);
                num8 = Integer.parseInt(str8);
                num9 = Integer.parseInt(str9);


                n00 = num1;
                n01 = num2;
                n02 = num3;
                n10 = num4;
                n11 = num5;
                n12 = num6;
                n20 = num7;
                n21 = num8;
                n22 = num9;


                c00 = num1;
                c10 = num2;
                c20 = num3;
                c01 = num4;
                c11 = num5;
                c21 = num6;
                c02 = num7;
                c12 = num8;
                c22 = num9;


                //TODO For First Row
                if (n00 > n01 && n00 > n02) lcm_0_row = n00;
                else if (n01 > n02 && n01 > n00) lcm_0_row = n01;
                else lcm_0_row = n02;

                while (true) {
                    if (lcm_0_row % n00 == 0 && lcm_0_row % n01 == 0 && lcm_0_row % n02 == 0) {
                        flag_0_row = 1;
                        break;
                    }
                    lcm_0_row++;
                }
                //TODO Second Row
                if (n10 > n11 && n10 > n12) lcm_1_row = n10;
                else if (n11 > n12 && n11 > n10) lcm_1_row = n11;
                else lcm_1_row = n12;

                while (true) {
                    if (lcm_1_row % n10 == 0 && lcm_1_row % n11 == 0 && lcm_1_row % n12 == 0) {
                        flag_1_row = 1;
                        break;
                    }
                    lcm_1_row++;
                }
                //TODO Third Row
                if (n20 > n21 && n20 > n22) lcm_2_row = n20;
                else if (n21 > n22 && n21 > n20) lcm_2_row = n21;
                else lcm_2_row = n22;

                while (true) {
                    if (lcm_2_row % n20 == 0 && lcm_2_row % n21 == 0 && lcm_2_row % n22 == 0) {
                        flag_2_row = 1;
                        break;
                    }
                    lcm_2_row++;
                }

                //TODO First Cols
                if (c00 > c10 && c00 > c20) lcm_O_cols = c00;
                else if (c10 > c00 && c10 > c20) lcm_O_cols = c10;
                else lcm_O_cols = c20;

                while (true) {
                    if (lcm_O_cols % c00 == 0 && lcm_O_cols % c10 == 0 && lcm_O_cols % c20 == 0) {
                        flag_0_cols = 1;
                        break;
                    }
                    lcm_O_cols++;
                }
                //TODO Second Cols
                if (c01 > c11 && c01 > c21) lcm_1_cols = c01;
                else if (c11 > c01 && c11 > c21) lcm_1_cols = c11;
                else lcm_1_cols = c21;

                while (true) {
                    if (lcm_1_cols % c01 == 0 && lcm_1_cols % c11 == 0 && lcm_1_cols % c21 == 0) {
                        flag_1_cols = 1;
                        break;
                    }
                    lcm_1_cols++;
                }
                //TODO Third Cols
                if (c02 > c12 && c02 > c22) lcm_2_cols = c02;
                else if (c12 > c02 && c12 > c22) lcm_2_cols = c12;
                else lcm_2_cols = c22;

                while (true) {
                    if (lcm_2_cols % c02 == 0 && lcm_2_cols % c12 == 0 && lcm_2_cols % c22 == 0) {
                        flag_2_cols = 1;
                        break;
                    }
                    lcm_2_cols++;
                }
                if (flag_0_row == 1) {
                    binding.tvResult.append("LCM of First Row:" + lcm_0_row + "\n");
                }
                if (flag_1_row == 1) {
                    binding.tvResult.append("LCM of Second Row:" + lcm_1_row + "\n");
                }
                if (flag_2_row == 1) {
                    binding.tvResult.append("LCM of Third Row:" + lcm_2_row + "\n");
                }
                if (flag_0_cols == 1) {
                    binding.tvResult.append("LCM of First Cols:" + lcm_O_cols + "\n");
                }
                if (flag_1_cols == 1) {
                    binding.tvResult.append("LCM of Second Cols:" + lcm_1_cols + "\n");
                }
                if (flag_2_cols == 1) {
                    binding.tvResult.append("LCM of Third Cols:" + lcm_2_cols + "\n");
                }
                if (lcm_0_row > lcm_1_row && lcm_0_row > lcm_2_row) max = lcm_0_row;
                else if (lcm_1_row > lcm_0_row && lcm_1_row > lcm_2_row) max = lcm_1_row;
                else max = lcm_2_row;

                while (true) {
                    if (max % lcm_0_row == 0 && max % lcm_1_row == 0 && max % lcm_2_row == 0) {
                        binding.tvResult.append("LCM Of Matrix:" + max);
                        break;
                    }
                    max++;
                }
            }
        });

    }
}