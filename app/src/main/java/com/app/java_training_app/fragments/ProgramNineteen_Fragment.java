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
import com.app.java_training_app.databinding.FragmentProgramNineteenBinding;

public class ProgramNineteen_Fragment extends Fragment {


    FragmentProgramNineteenBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProgramNineteenBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = binding.etFloor.getText().toString();

                if (str.isEmpty()) {
                    binding.etFloor.setError("Please Enter Floor");
                } else {
                    int floor = Integer.parseInt(str);

                    if (floor >= 26) {
                        Toast.makeText(getActivity(), "Sorry! Total Floor is 25", Toast.LENGTH_SHORT).show();
                    } else {
                        if (floor == 0) {
                            Toast.makeText(getActivity(), "Ground Floor is Not Allowed For Leave", Toast.LENGTH_SHORT).show();
                        } else if (floor == 10 || floor == 20) {
                            Toast.makeText(getActivity(), "Not for Living", Toast.LENGTH_SHORT).show();
                        } else if (floor == 11 || floor == 12) {
                            Toast.makeText(getActivity(), "Floor 11 And 12 Both Are Merged", Toast.LENGTH_SHORT).show();
                        } else if (floor == 24 || floor == 25) {
                            Toast.makeText(getActivity(), "Floor 24 And 25 Both Are Merged", Toast.LENGTH_SHORT).show();
                        } else if (floor == 24 || floor == 25) {
                            Toast.makeText(getActivity(), "Not For Sale", Toast.LENGTH_SHORT).show();
                        } else if (floor == 7 || floor == 9) {
                            Toast.makeText(getActivity(), "In Renovation Mode", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(getActivity(), floor + " th Floor is For Leave", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }
}