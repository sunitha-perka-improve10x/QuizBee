package com.example.quizbee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.quizbee.databinding.ActivityHomeBinding;

public class HomeActivity extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        buttonClick();
    }

    public void buttonClick(){
        binding.startBtn.setOnClickListener(v -> {
            Intent intent = new Intent(this,QuestionActivity.class);
            startActivity(intent);
        });
    }
}