package com.example.contactstore

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import java.util.zip.Inflater

class ContactAdapter(var contactList:List<Contacts>,var context:Context):RecyclerView.Adapter<ContactsViewHolder> () {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {

      var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item, parent, false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var currentContacts = contactList.get(position)
        holder.tvcontactName.text = currentContacts.name
        holder.tvPhoneNumber.text = currentContacts.phoneNumber
        holder.tvEmail.text = currentContacts.email
        Picasso
            .get()
            .load(currentContacts.imageUrl)
            .placeholder(R.drawable.holder)
            .into(holder.imgContact)

        holder.clContact.setOnClickListener {
            var intent = Intent(context, ContactView::class.java)
            intent.putExtra("contactName",currentContacts.name)
            intent.putExtra("PhoneNumber",currentContacts.phoneNumber)
            intent.putExtra("Email",currentContacts.email)
            intent.putExtra("imgUrl",currentContacts.imageUrl)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            context.startActivity(intent)


        }
        }
        override fun getItemCount(): Int {
            return contactList.size
        }
    }


    class ContactsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvcontactName = itemView.findViewById<TextView>(R.id.tvName)
        var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
        var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
        var imgContact = itemView.findViewById<ImageView>(R.id.imgContact)
        var clContact = itemView.findViewById<CardView>(R.id.clContact)


    }
