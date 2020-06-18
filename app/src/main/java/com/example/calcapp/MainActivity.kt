package com.example.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("Result", 0)
        startActivity(intent)

        var str1:String = editTexe1.text.toString()
        var str2:String = editTexe2.text.toString()

        var num1:Double = str1.toDouble()
        var num2:Double = str2.toDouble()
        var result = 0.0

        if (v.id == R.id.button1) {
            result = num1 + num2

        }else if (v.id == R.id.button2) {
            result = num1 - num2

        }else if (v.id == R.id.button3) {
            result = num1 * num2

        }else if (v.id == R.id.button4) {
            result = num1 / num2
        }
    }
}
