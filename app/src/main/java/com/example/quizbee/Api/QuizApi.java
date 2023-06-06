package com.example.quizbee.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class QuizApi {
    public QuizApiService createModelApiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://crudcrud.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        QuizApiService modelApiService = retrofit.create(QuizApiService.class);
        return modelApiService;
    }
}
