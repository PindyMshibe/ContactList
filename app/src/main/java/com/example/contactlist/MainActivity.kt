package com.example.contactlist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contactlist.core.model.User
import com.example.contactlist.core.model.adapter.userAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        //link recycler view to layout manager
        recyclerView.layoutManager = LinearLayoutManager(this)



        val contactList = ArrayList<User>()

        contactList.add(User("Phindile 1", "IT developer", "https://www.xitsonga.org/assets/images/Mukondleteri.jpg"))
        contactList.add(User("Phindile 2", "IT Tech", "https://www.xitsonga.org/assets/images/Mukondleteri.jpg"))


        //create the adapter and link with recyclerview
        val adapter = userAdapter(contactList)
        recyclerView.adapter = adapter


        //pass the user clicked onto the next screen
        adapter.onItemClick = { user ->
            val intent = Intent(this, UserDetails::class.java)
            intent.putExtra("User", user)
            startActivity(intent)

        }
    }
}


