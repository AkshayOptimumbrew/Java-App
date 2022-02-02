package com.app.java_training_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.app.java_training_app.databinding.ActivityMain2Binding;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    ActivityMain2Binding binding;
    private LinearLayout mLayout;
    private EditText mEditText;
    private Button mButton;
    int k = -1;
    int flag;
    int ss=0;
    ArrayList<String> applnserverinstnos = new ArrayList<String>();
    public static EditText textView[] = new EditText[100];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    k++;
                    flag=k;
                    final LinearLayout.LayoutParams lparams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, 50);
                    lparams.setMargins(20, 20, 20, 0);
                    textView[flag] = new EditText(getApplicationContext());
                    textView[flag].setLayoutParams(lparams);
                    textView[flag].setId(flag);

                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
//                bimLayout.addView(textView[flag]);


            }
        });
        binding.btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0;i<=k;i++)
                {
                    System.out.println("edit values"+ss+"......"+ textView[i].getText().toString());
                }
            }
        });


    }
}