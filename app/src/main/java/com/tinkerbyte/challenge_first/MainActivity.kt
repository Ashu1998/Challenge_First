package com.tinkerbyte.challenge_first

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private var randomNum:Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        randomNum = (0..10).random()


        textView = findViewById(R.id.textView1)

        val mBundle : Bundle? = intent.extras                      //Done to handle the first time launch
        if(mBundle!=null&& textView!=null) {
            val mString = mBundle.getString("SecNum")
            textView.text = mString
        }
        else{
            textView.text =randomNum.toString()

        }


    }
    public fun clickFun(view: View){

        val myIntent = Intent(this,SecondActivity::class.java)
        myIntent.putExtra("Number",randomNum.toString())
        startActivity(myIntent)

    }

}
