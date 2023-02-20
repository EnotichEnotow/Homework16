package com.example.homework16;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.homework16.databinding.ActivityMainBinding;
import com.example.homework16.databinding.NewsBinding;

public class News extends AppCompatActivity {
    NewsBinding binding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = NewsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(News.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}