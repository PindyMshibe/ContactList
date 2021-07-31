package com.example.contactlist.core.model.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.MainActivity
import com.example.contactlist.R
import com.example.contactlist.UserDetails
import com.example.contactlist.core.model.User

// this method is returning the view for each in the list
class userAdapter(val contactList: ArrayList<User>) : RecyclerView.Adapter<userAdapter.ViewHolder>() {


    var onItemClick: ((User) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): userAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_users, parent, false)
        return ViewHolder(v)
    }

    // this method is binding data on the list
    override fun onBindViewHolder(holder: userAdapter.ViewHolder, position: Int) {
        holder.bindItems(contactList[position])

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    //the class is holding the listview
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        //displays the user that is clicked on the next screen
        init {
            itemView.setOnClickListener {
                onItemClick?.invoke(contactList[adapterPosition])


            }
        }

        fun bindItems(user: User) {
            val textViewName = itemView.findViewById(R.id.userName) as TextView
            val textViewNo = itemView.findViewById(R.id.userNo) as TextView
            textViewName.text = user.name
            textViewNo.text = user.number
        }


    }
}
