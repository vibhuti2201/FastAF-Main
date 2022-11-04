package com.example.fastaf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.fastaf.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  var layoutManager : RecyclerView.LayoutManager?=null
    private  var adapter: RecyclerView.Adapter<RecyclerAdapter.ViewHolder>?=null


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        layoutManager = LinearLayoutManager(this)

        findViewById<RecyclerView>(R.id.rv).layoutManager = layoutManager
        adapter = RecyclerAdapter(arrayOf("Dropbox","Slack","Facebook","Github","Gmail","Twitter","Linkedin"),
            arrayOf("kaygo1988@gmail.com","kaygo1988@gmail.com","kaygo1988@gmail.com","kaygo1988@gmail.com","kaygo1988@gmail.com","kaygo1988@gmail.com","kaygo1988@gmail.com"),
            "New auth requested", arrayOf(R.drawable.dropbox,R.drawable.slack,R.drawable.facebook,R.drawable.github,R.drawable.gmail,R.drawable.twitter,R.drawable.linkdin)

        )
        (adapter as RecyclerAdapter).notifyDataSetChanged()
       binding.rv.adapter=adapter
    }
    }
