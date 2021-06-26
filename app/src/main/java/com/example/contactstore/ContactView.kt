package com.example.contactstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ContactView : AppCompatActivity() {
    lateinit var tvName2: TextView
    lateinit var tvPhone: TextView
    lateinit var tvEmail2: TextView
    lateinit var  imgContact2:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_view)

        tvName2=findViewById(R.id.tvName2)
        tvPhone=findViewById(R.id.tvPhone)
        tvEmail2=findViewById(R.id.tvEmail2)
        imgContact2=findViewById(R.id.imgContact2)


        var nameIntent=intent.getStringExtra("contactName")
        tvName2.text=nameIntent
        var phoneIntent=intent.getStringExtra("PhoneNumber")
        tvPhone.text=phoneIntent
        var email2Intent=intent.getStringExtra("Email")
        tvEmail2.text=email2Intent
        var imageIntent=intent.getStringExtra("imgUrl").toString()
        Picasso.get()
            .load(imageIntent)
            .into(imgContact2)



    }
}






