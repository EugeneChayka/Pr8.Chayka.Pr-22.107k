package com.example.pr8chaykapr_22107k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class splash extends AppCompatActivity implements View.OnClickListener{
    Button button10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if(view.getId()==R.id.button10){
            startActivity(new Intent(splash.this, MainActivity.class));
        }
    }
}