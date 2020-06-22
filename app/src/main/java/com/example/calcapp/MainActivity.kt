package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import java.lang.Exception
import android.support.design.widget.Snackbar

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

        Snackbar.make(rootLayout, "数字を入力して下さい", Snackbar.LENGTH_INDEFINITE)
            .setAction("Back") {
            }.show()
    }

    override fun onClick(v: View) {
        val intent = Intent(this, ResultActivity::class.java)

        try {

            var str1: String = editText1.text.toString()
            var str2: String = editText2.text.toString()

            var num1: Double = str1.toDouble()
            var num2: Double = str2.toDouble()
            var result = 0.0

            if (v.id == R.id.button1) {
                result = num1 + num2

            } else if (v.id == R.id.button2) {
                result = num1 - num2

            } else if (v.id == R.id.button3) {
                result = num1 * num2

            } else if (v.id == R.id.button4) {
                result = num1 / num2
            }

            intent.putExtra("Result", result)
            startActivity(intent)

        } catch (e: Exception) {
        }
    }
}
