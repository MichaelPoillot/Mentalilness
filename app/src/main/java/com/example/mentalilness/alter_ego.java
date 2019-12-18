package com.example.mentalilness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class alter_ego extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alter_ego);
    }

    public void closealterego(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
