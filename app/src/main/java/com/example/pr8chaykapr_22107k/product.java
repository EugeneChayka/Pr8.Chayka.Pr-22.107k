package com.example.pr8chaykapr_22107k;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class product extends AppCompatActivity implements View.OnClickListener{
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);
        btn = findViewById(R.id.button7);
        btn.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:57.777777, 88.656456343")));
    }
}