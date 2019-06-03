package com.tinkerbyte.challenge_first

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private var randomNum:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textView2)

        val num:String = intent.getStringExtra("Number")
        textView.text = num
    }
    public fun clickSecFun(view: View){
        randomNum = (10..20).random()
        val mIntent = Intent(this,MainActivity::class.java)
        mIntent.putExtra("SecNum",randomNum.toString())
        startActivity(mIntent)

    }
}
