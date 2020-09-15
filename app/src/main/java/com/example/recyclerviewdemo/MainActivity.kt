package com.example.recyclerviewdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter : Adapter
    private var dataSource = mutableListOf<String>()
    private var offset = 0
    private var page = 20
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = Adapter()
        val layoutManager = LinearLayoutManager(this)
        layoutManager.reverseLayout = false
        layoutManager.stackFromEnd = false
        list.layoutManager = layoutManager
        list.adapter = adapter
        add.setOnClickListener {
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            dataSource.add(0, Random().nextInt(200).toString())
            val mutableList = mutableListOf<String>()
            val subList = dataSource.subList(0, offset)
            for(l in subList){
                mutableList.add(l)
            }
            adapter.values = mutableList
//            adapter.notifyDataSetChanged()
        }
        generateData()
        loadMore()
    }

    private fun loadMore(){
        offset += page
        if(offset < dataSource.size) {

            val mutableList = mutableListOf<String>()
            val subList = dataSource.subList(0, offset)
            for(l in subList){
                mutableList.add(l)
            }
            adapter.values = mutableList
        }
    }

    private fun generateData(){
        for(i in 0..100){
            dataSource.add(i.toString())
        }
    }
}