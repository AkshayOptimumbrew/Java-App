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
import com.app.java_training_app.databinding.FragmentProgramEighteenBinding;

import java.util.Calendar;


public class ProgramEighteen_Fragment extends Fragment {

    FragmentProgramEighteenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramEighteenBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = binding.etYear.getText().toString();
                if (str.isEmpty()) {
                    binding.etYear.setError("Please Enter year");
                } else {
                    int year = Integer.parseInt(str);
                    int curr_year = Calendar.getInstance().get(Calendar.YEAR);
                    int diff = curr_year - year;
                    if (year >= 2022) {
                        Toast.makeText(getActivity(), "Sorry", Toast.LENGTH_SHORT).show();
                    } else {
                        if (diff == 0) {
                            Toast.makeText(getActivity(), "Welcome To The World", Toast.LENGTH_SHORT).show();
                        } else if (diff >= 1 && diff <= 12) {
                            Toast.makeText(getActivity(), "You Are Little Baby", Toast.LENGTH_SHORT).show();

                        } else if (diff >= 13 && diff <= 18) {
                            Toast.makeText(getActivity(), "Near to Come Younger", Toast.LENGTH_SHORT).show();

                        } else if (diff == 18) {
                            Toast.makeText(getActivity(), "Wow..You are Younger", Toast.LENGTH_SHORT).show();

                        } else if (diff >= 19 && diff <= 21) {
                            Toast.makeText(getActivity(), "Focus on Study", Toast.LENGTH_SHORT).show();

                        } else if (diff >= 22 && diff <= 28) {
                            Toast.makeText(getActivity(), "It's Time to Find Your Partner", Toast.LENGTH_SHORT).show();

                        } else if (diff >= 21 && diff <= 30) {
                            Toast.makeText(getActivity(), "Let's Make carrer", Toast.LENGTH_SHORT).show();

                        } else if (diff >= 31 && diff <= 50) {
                            Toast.makeText(getActivity(), "Self Enjoyment", Toast.LENGTH_SHORT).show();

                        } else if (diff >= 51 && diff <= 60) {
                            Toast.makeText(getActivity(), "Near to Retirement", Toast.LENGTH_SHORT).show();

                        } else if (diff >= 61 && diff <= 90) {
                            Toast.makeText(getActivity(), "Pray God", Toast.LENGTH_SHORT).show();

                        } else if (diff <= 91) {
                            Toast.makeText(getActivity(), "You Are so Healthy Person", Toast.LENGTH_SHORT).show();

                        }
                    }
                }
            }
        });
    }
}