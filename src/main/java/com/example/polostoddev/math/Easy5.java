package com.example.polostoddev.math;

/**
 * Created by satriodwiprabowo on 19/02/16.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;

public class Easy5 extends Activity {

    public ImageView v1,v2,v3;
    public Button lima,tiga,empat,enam,btn5;
    int tophone;
    private Button b1,b2;
    private int CurrentImage = 0;
    int[] images = {R.drawable.love1, R.drawable.love_2};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy2);
        tophone=R.drawable.love_2;

        Button back = (Button) findViewById(R.id.back);
        Button dua = (Button) findViewById(R.id.btn2);
        Button enam = (Button) findViewById(R.id.btn6);
        Button empat = (Button) findViewById(R.id.btn4);
        Button sembilan = (Button) findViewById(R.id.btn9);
        v1 = (ImageView) findViewById(R.id.imageView2);
        v2 = (ImageView) findViewById(R.id.imageView3);
        v3 = (ImageView) findViewById(R.id.imageView4);
        //try 2
        lima = (Button)  findViewById(R.id.btn5);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        empat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v3.setImageResource(R.drawable.love1);
            }
        });
        dua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v2.setImageResource(R.drawable.love1);
            }
        });
        sembilan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Jawaban adik salah :) sillahkan coba lagi", Toast.LENGTH_SHORT).show();
                v1.setImageResource(R.drawable.love1);
            }
        });
        enam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Permainan selesai untuk level easy selamat adik ^_^ ", Toast.LENGTH_LONG).show();
                Intent Easy5 = new Intent(Easy5.this, MainActivity.class);
                startActivity(Easy5);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

//Try to fix button

}


