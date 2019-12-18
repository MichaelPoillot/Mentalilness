package com.example.mentalilness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class cyber_bullying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cyber_bullying);
    }

    public void closecyberbullying(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
