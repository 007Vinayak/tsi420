package com.example.tsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpPage2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page2);
        Button back = (Button) findViewById(R.id.backbtnsignup);
        Button sgnup=(Button)findViewById(R.id.button10);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });
        sgnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signup();
            }
        });
    }
    public void back()
    {
        Intent intent = new Intent(this, SignUpPage1.class);
        startActivity(intent);
    }
    public void signup()
    {
        Intent intent = new Intent(this,SignUpPage1.class);
        startActivity(intent);
    }
}