package com.app.java_training_app.fragments;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweTwoBinding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramTweTwo_Fragment extends Fragment {

    FragmentProgramTweTwoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProgramTweTwoBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pan_regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
                String ad_regex = "^[2-9][0-9]{11}$";
                String str, pan, adhaar, input_ip, special;
                String ip = "(\\d{1,2}|(0|1)\\"
                        + "d{2}|2[0-4]\\d|25[0-5])";
                String regexip
                        = ip + "\\."
                        + ip + "\\."
                        + ip + "\\."
                        + ip;

                str = binding.etName.getText().toString().trim();
                pan = binding.etPan.getText().toString().trim();
                adhaar = binding.etAdhaar.getText().toString().trim();
                input_ip = binding.etIp.getText().toString().trim();
                special = binding.etSpecial.getText().toString().trim();

                Pattern np = Pattern.compile("[0-9]$");
                Matcher mn = np.matcher(str);

                if (!mn.find()) {
                    binding.etName.setError("Wrong Input");
//            System.out.println("wrong");
                } else {
//            System.out.println("Input True");
//            System.out.println("Enter Pan Card Number:");
//            pan = sc.next();
                    Pattern p_pan = Pattern.compile(pan_regex);
                    Matcher m_pan = p_pan.matcher(pan);

                    if (!m_pan.matches()) {
                        binding.etPan.setError("Invalid Pan Card Number");
                    } else if (pan.isEmpty()) {
                        binding.etPan.setError("Please Enter Pan Card Number");
                    } else {
                        if (!adhaar.matches(ad_regex)) {
                            binding.etAdhaar.setError("Invalid");
                        } else {
                            Pattern p_ip = Pattern.compile(regexip);
                            Matcher m_ip = p_ip.matcher(input_ip);
                            if (!m_ip.matches()) {
                                binding.etIp.setError("Invalid IP Address");
                            } else {
                                Pattern p = Pattern.compile("^[!@#$%^&*()`~};{_'+=<>./]");
                                Matcher m = p.matcher(special);
                                boolean a = m.find();

                                Pattern p1 = Pattern.compile("[!@#$%^&*()`~};{_'+=<>./]$");
                                Matcher m2 = p1.matcher(special);
                                boolean b = m2.find();

                                if (a == b) {
                                    System.out.println("True");
                                } else {
                                    System.out.println("False");
                                }
                            }
                            binding.tvResult.setText("Name:" + str + "\n" + "Pancard Number:" + pan + "\n"
                                    + "Adhaarcard Number:" + adhaar + "\n" + "Ip Address" + input_ip + "\n" + special);

                        }

                    }
                }
            }
        });
    }
}