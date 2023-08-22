package dev.alibek.telegramanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TgFastActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tg_fast)
    initViews()
    }
    private fun initViews() {
        val bNext=findViewById<Button>(R.id.b_fast)
        bNext.setOnClickListener {
            val intent = Intent(this,TgGiftActivity::class.java)
            startActivity(intent)
        }
    }
}