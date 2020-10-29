package com.example.tsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpPage1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page1);
        Button next = (Button) findViewById(R.id.next);
        Button btl=(Button)findViewById(R.id.back2log);
        btl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backtwologin();
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextpagesign();
            }
        });
    }
    public void backtwologin()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void nextpagesign()
    {
        Intent intent = new Intent(this, SignUpPage2.class);
        startActivity(intent);
    }
}