package com.example.wsr

import RecyclerViewBank
import android.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = RecyclerViewBank()

        recyclerView.layoutManager = GridLayoutManager(this, 1)

        var actionbar = supportActionBar
        actionbar?.setDisplayHomeAsUpEnabled(true)

    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
class  Bank(){
    var type = "Банкомат"
    var address = "Москва пр.Строителей 43"
    var work = "Открыто"
    var work_time = "8:00-10:00"

    override fun toString(): String {
        return type
    }
}
class User(){
    var name = "Родион"
    var state = "не активен"
    var image = ""

    override fun toString(): String {
        return name
    }
}
