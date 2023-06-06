package com.example.quizbee.module;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QuizModule {
    @SerializedName("_id")
    private String _id;
    private Module module;

    @SerializedName("questions")
    private ArrayList<Questions> questions;
}
