package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweSevenBinding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProgramTweSeven_Fragment extends Fragment {


    FragmentProgramTweSevenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramTweSevenBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                int num1, num2, num3, num4, num5, num6, num7, num8, num9;
                int r1 = 1, r2 = 1, r3 = 1, c1 = 1, c2 = 1, c3 = 1, o = 1, max = 1;
                int x = 1, y = 1, p = 1;
                int s = 1, t = 1, r = 1;
                //TODO For Rows
                int n00, n01, n02;
                int n10, n11, n12;
                int n20, n21, n22;

                //TODO For Cols
                int c00, c10, c20;
                int c01, c11, c21;
                int c02, c12, c22;

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
                } else {
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

                    //TODO For First Row
                    while (x <= n00 && x <= n01 && x <= n02) {
                        if (n00 % x == 0 && n01 % x == 0 && n02 % x == 0) {
                            r1 = x;
                        }
                        x++;
                    }
                    //TODO Second Row
                    n10 = num4;
                    n11 = num5;
                    n12 = num6;
                    while (y <= n10 && y <= n11 && y <= n12) {
                        if (n10 % y == 0 && n11 % y == 0 && n12 % y == 0) {
                            r2 = y;
                        }
                        y++;
                    }
                    //TODO Third Row
                    n20 = num7;
                    n21 = num8;
                    n22 = num9;
                    while (p <= n20 && p <= n21 && p <= n22) {
                        if (n20 % p == 0 && n21 % p == 0 && n22 % p == 0) {
                            r3 = p;
                        }
                        p++;
                    }


                    //TODO First Cols
                    c00 = num1;
                    c10 = num4;
                    c20 = num7;
                    while (s <= c00 && s <= c10 && s <= c20) {
                        if (c00 % s == 0 && c10 % s == 0 && c20 % s == 0) {
                            c1 = s;
                        }
                        s++;
                    }
                    //TODO Second Cols
                    c01 = num2;
                    c11 = num5;
                    c21 = num8;
                    while (t <= c01 && t <= c11 && t <= c21) {
                        if (c01 % t == 0 && c11 % t == 0 && c21 % t == 0) {
                            c2 = t;
                        }
                        t++;
                    }
                    //TODO Third Cols
                    c02 = num3;
                    c12 = num6;
                    c22 = num9;
                    while (r <= c02 && r <= c12 && r <= c22) {
                        if (c02 % r == 0 && c12 % r == 0 && c22 % r == 0) {
                            c3 = r;
                        }
                        r++;
                    }
                    binding.tvResult.append(num1 + "\t" + num2 + "\t" +
                            num3 + "\t" + "\n" + num4 + "\t" + num5 + "\t" + num6 + "\t" + "\n" + num7 + "\t" +
                            num9 + "\t" + num8 + "\t" + num9 + "\n");

                    binding.tvResult.append("GCD Of First Row:" + r1 + "\n");
                    binding.tvResult.append("GCD Of Second Row:" + r2 + "\n");
                    binding.tvResult.append("GCD Of Third Row:" + r3 + "\n");
                    binding.tvResult.append("GCD Of First Columns:" + c1 + "\n");
                    binding.tvResult.append("GCD Of Second Columns:" + c2 + "\n");
                    binding.tvResult.append("GCD Of Third Columns:" + c3 + "\n");

                    while (o <= r1 && o <= r2 && o <= r3 && o <= c1 && o <= c2 && o <= c3) {
                        if (r1 % o == 0 && r2 % o == 0 && r3 % o == 0 && c1 % o == 0 && c2 % o == 0 && c3 % o == 0) {
                            max = o;
                        }
                        o++;
                    }
                    binding.tvResult.append("GCD Of Matrix:" + max);
                }
            }
        });
    }
}