package com.example.mentalilness;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class desc_depresi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desc_depresi);


//        coba michaelsdasd
    }

    public void closedepresion(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
