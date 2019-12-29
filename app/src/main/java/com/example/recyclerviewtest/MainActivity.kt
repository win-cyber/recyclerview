package com.example.recyclerviewtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.adapter.FruitAdapter
import com.example.recyclerviewtest.model.Fruits

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView:RecyclerView=findViewById(R.id.recycler_view)

        recyclerView.layoutManager=LinearLayoutManager(this)
//        recyclerView.layoutManager=GridLayoutManager(this,2)

        val fruitList=ArrayList<Fruits>()

        fruitList.add(Fruits("Apple",R.drawable.ic_all_out_black))
        fruitList.add(Fruits("orange",R.drawable.ic_all_out_black))
        fruitList.add(Fruits("Blueberry",R.drawable.ic_all_out_black))
        fruitList.add(Fruits("Strawberry",R.drawable.ic_all_out_black))

        var fruitAdapter=FruitAdapter(fruitList)
        recyclerView.adapter=fruitAdapter


    }
}
