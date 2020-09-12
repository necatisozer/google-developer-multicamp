package com.necatisozer.multicamp.kotlinoverview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        buttonLogin.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            val name = editTextUsername.text.toString()
            intent.putExtra("name_key", name)
            startActivity(intent)
        }
    }
}