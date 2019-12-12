package com.example.mentalilness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void depresiclick(View view) {
        Intent intent = new Intent(this,desc_depresi.class);
        startActivity(intent);
    }

    public void kepercayaandiriclick(View view) {
    }

    public void emosiclick(View view) {
    }

    public void eatingdisorderclick(View view) {
    }

    public void cyberbulyclick(View view) {
    }

    public void alteregoclick(View view) {
    }
}
