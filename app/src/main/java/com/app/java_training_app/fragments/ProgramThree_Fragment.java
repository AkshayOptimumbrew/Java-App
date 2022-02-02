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
import com.app.java_training_app.databinding.FragmentProgramThreeBinding;


public class ProgramThree_Fragment extends Fragment {
    FragmentProgramThreeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentProgramThreeBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                String num1=binding.etNum1.getText().toString();
                String num2=binding.etNum2.getText().toString();

                if(num1.isEmpty()){
                    binding.etNum1.setError("Please Enter Num1");
                }else if(num2.isEmpty()){
                    binding.etNum2.setError("Please Enter Num2");
                }else{
                    int a=Integer.parseInt(num1);
                    int b=Integer.parseInt(num2);
                /*temp=a;
		            a=b;
		            b=temp;*/
                    a=a+b;
                    b=a-b;
                    a=a-b;
                    System.out.println();
                    System.out.println("a::"+a+"---"+"b::"+b);

                    binding.tvResult.setText("After Swapping::"+"\n"+
                            "a::"+a+"---"+"b::"+b);

                }

            }
        });
    }
}