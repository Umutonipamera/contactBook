package com.example.contactstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castView()
        clickNext()
    }
    fun castView(){
        btnNext=findViewById<Button>(R.id.btnNext)


    }
    fun clickNext(){
        btnNext.setOnClickListener{
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)

        }
    }

}

