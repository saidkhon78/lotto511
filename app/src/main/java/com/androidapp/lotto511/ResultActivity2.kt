package com.androidapp.lotto511

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        Toast.makeText(this,"Result Activity",Toast.LENGTH_LONG).show()
    }
}