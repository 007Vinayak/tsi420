package com.example.tsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button fgp = (Button) findViewById(R.id.Fgpass);
        Button sup=(Button)findViewById(R.id.Signuplp);
        Button lg=(Button)findViewById(R.id.Loginlp);
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opensignupp();
            }
        });
        fgp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFGpass();
            }
        });
        lg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EnterTest();
            }
        });
    }
    public void openFGpass()
    {
        Intent intent = new Intent(this, ForgotPassword2.class);
        startActivity(intent);
    }
    public void opensignupp()
    {
        Intent intent = new Intent(this,SignUpPage1.class);
        startActivity(intent);
    }
    public void EnterTest()
    {
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
}