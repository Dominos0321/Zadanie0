package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {//
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x=0;
    findViewById<Button>(R.id.prawo).setOnClickListener {
        if(x==0) {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.swoledog);
            x++;
        }
        else if(x==1) {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.popcat1);
            x++;
        }
        else if(x==2) {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.popcat2);
            x++;
        }
    }

    findViewById<Button>(R.id.lewo).setOnClickListener {
        if(x==1) {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cheems);
            x--;
        }
        else if(x==2) {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.swoledog);
            x--;
        }
        else if(x==3) {
            findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.popcat1);
            x--;
        }
    }

    findViewById<Button>(R.id.olewo).setOnClickListener {
        var obrot = findViewById<EditText>(R.id.obroty1).text.toString().toFloat();
        findViewById<ImageView>(R.id.imageView).rotation = findViewById<ImageView>(R.id.imageView).rotation - obrot;
    }

    findViewById<Button>(R.id.oprawo).setOnClickListener {
        var obrot = findViewById<EditText>(R.id.obroty1).text.toString().toFloat();
        findViewById<ImageView>(R.id.imageView).rotation += obrot;
    }

    findViewById<Button>(R.id.Skala1).setOnClickListener {
        var skala = findViewById<EditText>(R.id.wielk).text.toString().toFloat()
        findViewById<ImageView>(R.id.imageView).scaleX = skala;

        findViewById<ImageView>(R.id.imageView).scaleY = skala;
    }

    findViewById<Button>(R.id.Alfa1).setOnClickListener {
        var sigma = findViewById<EditText>(R.id.przez).text.toString().toInt()
        findViewById<ImageView>(R.id.imageView).imageAlpha = sigma;
    }
        }
    }