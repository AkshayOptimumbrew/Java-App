package com.app.java_training_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import com.app.java_training_app.adapter.CustomAdapter;
import com.app.java_training_app.databinding.ActivityMainBinding;
import com.app.java_training_app.model.Question;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    ArrayList<Question> questionList;
    AssetManager assetManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        assetManager = getAssets();
        questionList = new ArrayList<>();
        loadImage();
        init();

    }
    private void init(){
        CustomAdapter adapter = new CustomAdapter(questionList, MainActivity.this);
        binding.rcView.setAdapter(adapter);
        binding.rcView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
    }
    private void loadImage(){
        try {
            InputStream ims = assetManager.open("image/one1.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 1", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/two.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 2", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/three.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 3", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/four.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 4", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/five.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 5", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/six.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 6", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/seven.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 7", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/eight.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 8", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/nine.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 9", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/ten.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 10", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/eleven.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 11", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twelve.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 12", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/thirteen.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 13", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/fourteeb.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 14", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/fifteen.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 15", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/sixteen.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 16", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/seventeen.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 17", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/eighteen.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 18", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/nineteen.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 19", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twenty.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 20", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_one1.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 21", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_two.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 22", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_three.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 23", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_four.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 24", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_five.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 25", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_six.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 26", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_seven.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 27_GCD", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_seven.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 27_LCM", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }
        try {
            InputStream ims = assetManager.open("image/twe_eight.PNG");
            Drawable d = Drawable.createFromStream(ims, null);
            questionList.add(new Question("PROGRAM 28", d));

        } catch (IOException e) {
            Log.i("TAG", "onCreate: " + e.getMessage());
            e.printStackTrace();
        }

    }
}