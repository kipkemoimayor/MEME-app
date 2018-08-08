package com.example.collok.meme;

import android.support.v7.app.AppCompatActivity;


import android.os.Bundle;




public class MainActivity extends AppCompatActivity implements Top.TopListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String bottom) {
        Bottom buttom=(Bottom)getSupportFragmentManager().findFragmentById(R.id.fragment2);
        buttom.setMemeText(top,bottom);


    }
}
