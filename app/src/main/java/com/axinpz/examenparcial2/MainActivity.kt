package com.axinpz.examenparcial2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.lang.IllegalArgumentException

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGo2RecyclerView = findViewById<Button>(R.id.btn_rec_view)

        btnGo2RecyclerView.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        val intent = when(view.id){
            R.id.btn_rec_view -> Intent(this, MoviesActivity::class.java)
            else -> throw IllegalArgumentException("Invalid Action")
        }
        startActivity(intent)
    }
}