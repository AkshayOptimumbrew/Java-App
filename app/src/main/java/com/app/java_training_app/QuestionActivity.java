package com.app.java_training_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;

import com.app.java_training_app.databinding.ActivityQuestionBinding;
import com.app.java_training_app.fragments.ProgramOne_Fragment;

public class QuestionActivity extends AppCompatActivity {

    ActivityQuestionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityQuestionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        byte[] byteArray = getIntent().getByteArrayExtra("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

        binding.imageView.setImageBitmap(bmp);
        String question=getIntent().getStringExtra("question");
        binding.tvProgram.setText(question);

        binding.btnRun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RunActivity.class);
                intent.putExtra("question",question);
                startActivity(intent);

                /*if(question.endsWith("PROGRAM 1")){
                    startActivity(new Intent(getApplicationContext(),RunActivity.class));
                }*/
            }
        });


    }
}