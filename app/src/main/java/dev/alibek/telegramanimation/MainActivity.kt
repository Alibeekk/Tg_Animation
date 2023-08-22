package dev.alibek.telegramanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val bNext=findViewById<Button>(R.id.b_tg)
        bNext.setOnClickListener {
            val intent = Intent(this,TgFastActivity::class.java)
            startActivity(intent)
        }
    }
}