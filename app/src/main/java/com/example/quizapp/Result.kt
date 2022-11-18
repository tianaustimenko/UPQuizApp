package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_result.*

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        supportActionBar?.hide()

        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val score=intent.getStringExtra(setData.score)
        val totalQuestion=intent.getStringExtra("total size")

        Score.text="${score} / ${totalQuestion}"
    }

    fun returnClick(view: View) {
        val intent=Intent(this@Result,MainActivity::class.java)
        startActivity(intent)
    }
}