package dev.alibek.telegramanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TgSecureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tg_secure)
        initViews()
    }
    private fun initViews() {
        val bNext = findViewById<Button>(R.id.b_infinity)
        bNext.setOnClickListener {
            val intent= Intent(this,TgCloudActivity::class.java)
            startActivity(intent)
        }
    }
}