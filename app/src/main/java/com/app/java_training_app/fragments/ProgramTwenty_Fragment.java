package com.app.java_training_app.fragments;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTwentyBinding;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramTwenty_Fragment extends Fragment {

    FragmentProgramTwentyBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramTwentyBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name,email,password,phone,gender;
                String regexnum = "(0|91)?[7-9][0-9]{9}";
                String pass = "^(?=.*[0-9])"
                        + "(?=.*[a-z])(?=.*[A-Z])"
                        + "(?=.*[@#$%^&+=])"
                        + "(?=\\S+$).{8,20}$";

                name=binding.etName.getText().toString();
                email=binding.etEmail.getText().toString();
                password=binding.etPassword.getText().toString();
                phone=binding.etPhone.getText().toString();
                gender=binding.etGender.getText().toString();

                Pattern p = Pattern.compile(pass);
                Matcher m = p.matcher(password);

                Pattern pnum = Pattern.compile(regexnum);
                Matcher mnum = pnum.matcher(phone);

                if(name.isEmpty()){
                    binding.etName.setError("Please Enter Name");
                }else if(email.isEmpty()){
                    binding.etEmail.setError("Please Enter Email");
                }else if(!email.endsWith("@gmail.com")){
                    binding.etEmail.setError("Please Enter Valid Email");
                }else if(gender.isEmpty()){
                    binding.etGender.setError("Please Enter Gender");
                }else if(!(gender.equals("male")||gender.equals("MALE")||gender.equals("female")||gender.equals("FEMALE"))){
                    binding.etGender.setError("Invalid");
                }else if(phone.isEmpty()){
                    binding.etPhone.setText("Enter Phone Number");
                }else if(!mnum.matches()){
                    binding.etPhone.setError("Wrong Number");
                }else if(password.isEmpty()){
                    binding.etPassword.setError("Please Enter Password");
                }else if(!m.matches()){
                    binding.etPassword.setError("Please Enter Valid Password");
                }else{
                    binding.tvResult.setText(name+"\n"+email+"\n"+password+"\n"+phone+"\n"+gender);
                }

            }
        });
    }
}