package com.example.zadanie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var n=0;
        if (n ==0) {
            findViewById<Button>(R.id.button2).setOnClickListener {
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.swoledog);
                n++;
            }
        }
             else if(n ==1) {
                findViewById<Button>(R.id.button1).setOnClickListener {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.cheems)
                    n--;
                }
                findViewById<Button>(R.id.button2).setOnClickListener {
                    findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.popcat1)
                }
            }
        }
    }
}