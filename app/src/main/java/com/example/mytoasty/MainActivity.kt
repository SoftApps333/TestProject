package com.example.mytoasty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.toasty.Toasty
import com.example.toasty.Toasty.toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toasty("Testing Library")
    }
}