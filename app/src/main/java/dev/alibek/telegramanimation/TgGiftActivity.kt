package dev.alibek.telegramanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TgGiftActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tg_gift)
        initViews()
    }

    private fun initViews() {
        val bNext = findViewById<Button>(R.id.b_gift)
        bNext.setOnClickListener {
            val intent=Intent(this,TgInfinityActivity::class.java)
            startActivity(intent)
        }
    }
}