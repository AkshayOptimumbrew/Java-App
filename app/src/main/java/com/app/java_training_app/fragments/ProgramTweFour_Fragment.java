package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramTweFourBinding;

public class ProgramTweFour_Fragment extends Fragment {

    FragmentProgramTweFourBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramTweFourBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                int a[]={2,7,4,-5,11,5,20};
                int sum=15;

                for(int i=0;i<a.length;i++){
                    for(int j=i+1;j<a.length;j++){
                        if((a[i]+a[j])==15){
                            binding.tvResult.append(String.valueOf(a[i]+"+"+a[j]+"="+sum)+"\n");
                        }
                    }
                }
            }
        });
    }
}