package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.java_training_app.R;
import com.app.java_training_app.databinding.FragmentProgramFifteenBinding;


public class ProgramFifteen_Fragment extends Fragment {
    FragmentProgramFifteenBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentProgramFifteenBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.tvResult.setText("");
                int total=1;
                int a[]={1,2,3,4,6,7,8,9};

                for(int i=2;i<=a.length+1;i++){
                    total=total+i;
                    total=total-a[i-2];
                }
                binding.tvResult.append("Missing Number is:"+String.valueOf(total)+"\n");
                System.out.println("Missing Number is:"+total);
                for(int i=1;i<=10;i++){
                    System.out.println(total+"*"+i+"="+(total*i));
                    binding.tvResult.append(String.valueOf(total)+"*"+i+"="+String.valueOf(total*i)+"\n");
                }
            }
        });
    }
}