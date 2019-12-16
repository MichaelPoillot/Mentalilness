package com.example.mentalilness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class desc_kepercayaandiri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_kepercayaandiri);
    }

    public void closekepercayaandiri(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
