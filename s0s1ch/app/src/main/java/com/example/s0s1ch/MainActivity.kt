package com.example.s0s1ch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        setContentView(R.layout.activity_main)
    }

    fun ClickSum(view: View) {
        val num1 = findViewById<TextView>(R.id.chislo1)
        val num2 = findViewById<TextView>(R.id.chislo2)
        val chislo1 = num1.text.toString().toInt()
        val chislo2 = num2.text.toString().toInt()
        val result = findViewById<TextView>(R.id.result)
        val res = chislo1 + chislo2
        result.text = res.toString()
        result.visibility = View.VISIBLE
    }

    fun ClickMin(view: View) {
        var num1 = findViewById<TextView>(R.id.chislo1)
        var num2 = findViewById<TextView>(R.id.chislo2)
        var chislo1 = num1.text.toString().toInt()
        var chislo2 = num2.text.toString().toInt()
        var result = findViewById<TextView>(R.id.result)
        var res = chislo1 - chislo2
        result.text = res.toString()
        result.visibility = View.VISIBLE
    }

    fun ClickUmn(view: View) {
        var num1 = findViewById<TextView>(R.id.chislo1)
        var num2 = findViewById<TextView>(R.id.chislo2)
        var chislo1 = num1.text.toString().toInt()
        var chislo2 = num2.text.toString().toInt()
        var result = findViewById<TextView>(R.id.result)
        var res = chislo1 * chislo2
        result.text = res.toString()
        result.visibility = View.VISIBLE
    }

    fun ClickDel(view: View) {
        var num1 = findViewById<TextView>(R.id.chislo1)
        var num2 = findViewById<TextView>(R.id.chislo2)
        var chislo1 = num1.text.toString().toDouble()
        var chislo2 = num2.text.toString().toDouble()
        val result = findViewById<TextView>(R.id.result)
        val res = chislo1 / chislo2
        val ress = res % 1

        when (ress) {
            0.0 -> result.text = res.toInt().toString()
            else -> result.text = res.toString()
        }

        result.visibility = View.VISIBLE
    }

}