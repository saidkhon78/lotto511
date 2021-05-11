package com.androidapp.lotto511

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class NameActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name2)

        Toast.makeText(this,"Name Activity", Toast.LENGTH_LONG).show()

    }
}