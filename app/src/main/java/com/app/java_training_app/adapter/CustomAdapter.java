package com.app.java_training_app.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.java_training_app.QuestionActivity;
import com.app.java_training_app.R;
import com.app.java_training_app.databinding.CustomAdapterBinding;
import com.app.java_training_app.model.Question;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.myViewHolder>{

    ArrayList<Question> questionList;
    Context context;

    public CustomAdapter(ArrayList<Question> questionList, Context context) {
        this.questionList = questionList;
        this.context = context;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CustomAdapterBinding binding=CustomAdapterBinding.inflate(LayoutInflater.from(context),parent,false);
        return new myViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        Question question=questionList.get(position);
        holder.binding.imageView.setImageDrawable(question.getImageId());
        holder.binding.tvProgram.setText(question.getQuestion());

        holder.binding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmap = ((BitmapDrawable)question.getImageId()).getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();

                Intent intent=new Intent(context, QuestionActivity.class);
                intent.putExtra("image",byteArray);
                intent.putExtra("question",question.getQuestion());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return questionList.size();
    }

    public static class myViewHolder extends RecyclerView.ViewHolder {
        CustomAdapterBinding binding;
        public myViewHolder(@NonNull CustomAdapterBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
