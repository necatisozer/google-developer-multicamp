package com.necatisozer.multicamp.kotlinoverview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isInvisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        // mainTextView.text = "Valla Merveden konu aç"
        // val txt = mainTextView.text
        // Toast.makeText(this,txt,Toast.LENGTH_LONG).show()


        /*
        mainButton.setOnClickListener {
            // val view = findViewById<View>(android.R.id.content).rootView
            // Snackbar.make(view, R.string.button_action, Snackbar.LENGTH_LONG).show()

            mainTextView.setText(R.string.button_action)
        }
         */

        /*
        mainButton.setOnClickListener {
            val name = inputName.text
            if (name.isNotEmpty()) {
                mainTextView.text = "Merhaba, $name"
            }
        }

         */

        /*
        inputName.doOnTextChanged { text, start, before, count ->
            if (text.isNullOrBlank().not()) {
                mainTextView.text = "Merhaba, $text"
            } else {
                mainTextView.text = ""
            }
        }

         */

        mainButton.setOnClickListener {
            imageView.isInvisible = !imageView.isInvisible
        }

    }
}