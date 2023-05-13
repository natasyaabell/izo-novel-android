package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    LinearLayout menuInfoPengguna;
    TextView favoriteku;
    ImageView daftarnovelku;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menuInfoPengguna = findViewById(R.id.informasi_pengguna);
        menuInfoPengguna.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, BiodataActivity.class);
                startActivity(intent);
                return false;
            }
        });

        favoriteku = findViewById(R.id.favoriteku);
        favoriteku.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, Favorite.class);
                startActivity(intent);
                return false;
            }
        });

        daftarnovelku = findViewById(R.id.daftarnovelku);
        daftarnovelku.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(MainActivity.this, DaftarNovelActivity.class);
                startActivity(intent);
                return false;
            }
        });
    }
}