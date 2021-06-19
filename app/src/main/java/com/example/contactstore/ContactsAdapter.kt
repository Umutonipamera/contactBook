package com.example.contactstore

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater

class ContactAdapter(var contactList:List<Contacts>):RecyclerView.Adapter<ContactsViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView=LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        var current_Contacts=contactList.get(position)
        holder.tvcontactName.text=current_Contacts.name
        holder.tvPhoneNumber.text=current_Contacts.phoneNumber
        holder.tvEmail.text=current_Contacts.email


    }
    override fun getItemCount(): Int {
       return contactList.size
    }
}












class ContactsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvcontactName=itemView.findViewById<TextView>(R.id.tvName)
     var tvPhoneNumber=itemView.findViewById<TextView>(R.id.tvPhoneNumber)
     var tvEmail=itemView.findViewById<TextView>(R.id.tvEmail)

}