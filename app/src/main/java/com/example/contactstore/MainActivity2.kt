package com.example.contactstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var rvContacts=findViewById<RecyclerView>(R.id.rvcontacts)
        var contactList= listOf(
            Contacts("Juliet Mbabazi","+250789875102","juliet@gmail.com"),
            Contacts("Belinda Umutoni","+250785509030","belinda@gmail.com"),
            Contacts("Joshua Niyonshuti","+250783405060","joshuaa@gmail.com"),
            Contacts("Lydie Kami","+250788523820","kamikazii@gmail.com"),
            Contacts("Belyse Intwaza","+2507899872010","belysee@gmail.com"),
            Contacts("Celine Gushima","+250788541230","celinee@gmail.com")
        )
        var contactsAdapter=ContactAdapter(contactList)
        rvContacts.layoutManager=LinearLayoutManager(baseContext)
        rvContacts.adapter=contactsAdapter
    }
}