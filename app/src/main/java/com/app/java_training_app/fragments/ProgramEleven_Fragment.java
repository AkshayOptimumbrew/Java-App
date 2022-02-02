package com.app.java_training_app.fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.app.java_training_app.R;


public class ProgramEleven_Fragment extends Fragment {

    Button button;
    TextView tvResult;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_program_eleven_, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        button=view.findViewById(R.id.btnRun);
        tvResult=view.findViewById(R.id.tvResult);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvResult.setText("");
                int a[]={2,8,6,3,8,9};
                int temp,i,j;

                int n=a.length;

                for(i=0;i<n/2;i++){
                    for(j=i;j<n/2;j++){
                        if(a[i]>a[j]){
                            temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                    tvResult.append(String.valueOf(a[i]));
                    System.out.print(a[i]);
                }
                for(i=n/2;i<n;i++){
                    for(j=i;j<n;j++){
                        if(a[i]<a[j]){
                            temp=a[i];
                            a[i]=a[j];
                            a[j]=temp;
                        }
                    }
                    tvResult.append(String.valueOf(a[i]));
                    System.out.print(a[i]);
                }
            }
        });
    }
}