package com.app.java_training_app.fragments;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramSevenBinding;


public class ProgramSeven_Fragment extends Fragment {

    FragmentProgramSevenBinding binding;
    double units = 0, rupees = 0, diff, finalAmount = 0;
    boolean nb, pb;
    String name, password = "@#$123456", strUnit;
    String regexpassword = "^(?=.*[0-9])"
            + "(?=.*[@#$%^&+=])"
            + "(?=\\S+$).{8,20}$";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramSevenBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                name = binding.etName.getText().toString();
                password = binding.etPassword.getText().toString();
                strUnit = binding.etUnit.getText().toString();


                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                    nb = name.chars().allMatch(Character::isDigit);
                }

                if (name.isEmpty()) {
                    binding.etName.setError("Please Enter Name");
                } else if (nb) {
                    binding.etName.setError("Please Enter Valid Name");
                } else if (strUnit.isEmpty()) {
                    binding.etUnit.setError("Please Enter Unit");
                } else {
                    units = Double.parseDouble(strUnit);
                    pb = password.matches(regexpassword);
                    if (!pb) {
                        binding.etPassword.setError("Password Must be At Least 8 Characters");
                    } else {
                        if (units >= 1 && units < 50) {   //---rupees. 10/unit
                            diff = units - 1;
                            rupees = (diff * 0.4);
                            finalAmount = rupees;
                            System.out.println("Total Amount:" + rupees);
                        }
                        if (units >= 50 && units < 150) { //---rupees. 15/unit
                            diff = units - 50;
                            rupees = 10 + (diff * 0.15);
                            finalAmount = rupees;
                            System.out.println("Total Amount:" + rupees);
                        }
                        if (units >= 150 && units < 200) {  //---rupees. 20/unit
                            diff = units - 150;
                            rupees = 25 + (diff * 0.4);
                            finalAmount = rupees;
                            System.out.println("Total Amount:" + rupees);
                        }
                        if (units >= 200 && units < 300) {  //---rupees. 25/unit
                            diff = units - 200;
                            rupees = 45 + (diff * 0.25);
                            finalAmount = rupees;
                            System.out.println("Total Amount:" + rupees);
                        }
                        if (units >= 300) { //---rupees. 30/unit
                            diff = units - 300;
                            rupees = 70 + (diff * (units / 300));
                            finalAmount = rupees;
                            System.out.println("Total Amount:" + rupees);
                        }

                        if (password.equals("@#$123456")) {
                            rupees = ((rupees * 30) / 100);
                            finalAmount = rupees;
                            System.out.println("Payable Amount:" + rupees);
                        } else {
                            Toast.makeText(getActivity(), "Sorry!! password Wrong That's Why You Can't Get Discount...", Toast.LENGTH_SHORT).show();
                            System.out.println("Sorry!! password Wrong That's Why You Can't Get Discount...");
                        }
                        binding.tvResult.setText("Name:" + name + "\n" +
                                "Password:" + password + "\n" +
                                "Units:" + units + "\n" +
                                "Final Amount:" + String.valueOf(finalAmount));
                    }
                }
            }
        });
    }
}