package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
    }

    fun goClick(view: View) {
        val intent:Intent=Intent(this@MainActivity,QuestionActivity::class.java)
        startActivity(intent)
    }

    fun infoClick(view: View) {
        val intent:Intent=Intent(this@MainActivity,InfoActivity::class.java)
        startActivity(intent)
    }

}