package com.app.java_training_app.model;

import android.graphics.drawable.Drawable;

public class Question {
    String question;
    Drawable imageId;

    public Question(String question, Drawable imageId) {
        this.question = question;
        this.imageId = imageId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Drawable getImageId() {
        return imageId;
    }

    public void setImageId(Drawable imageId) {
        this.imageId = imageId;
    }
}
