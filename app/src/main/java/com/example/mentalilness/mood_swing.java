package com.example.mentalilness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class mood_swing extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mood_swing);
    }

    public void closeemosi(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
