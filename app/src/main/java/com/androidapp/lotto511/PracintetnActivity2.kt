package com.androidapp.lotto511

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PracintetnActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pracintetn2)


        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnConstellation = findViewById<Button>(R.id.btnConstellation)
        val btnName = findViewById<Button>(R.id.btnConstellation)
        val btnResult = findViewById<Button>(R.id.btnResult)

        btnMain.setOnClickListener {
            startActivity(Intent(this@PracIntentActivity2, MainActivity::class.java))
        }
        btnConstellation.setOnClickListener {
            startActivity(Intent(this@PracIntentActivity2, ConstellationActivity2 ::class.java))
        }
        btnName.setOnClickListener{
            startActivity(Intent(this@PracIntentActivity2, NameActivity2 ::class.java))
        }
        btnResult.setOnClickListener(Intent(this@PracIntetnActivity2, ResultActivity2::class::java))
    }
}