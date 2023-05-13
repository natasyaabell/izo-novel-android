package com.sata.izonovel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Favorite extends AppCompatActivity {
    LinearLayout detailnovelku;
    ImageView filosofiku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);
        detailnovelku = findViewById(R.id.detailnovelku);
        detailnovelku.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(Favorite.this, DetailNovel.class);
                startActivity(intent);
                return false;
            }
        });

        filosofiku = findViewById(R.id.filosofiku);
        filosofiku.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Intent intent = new Intent(Favorite.this, DetailNovel2.class);
                startActivity(intent);
                return false;
            }
        });
    }
}