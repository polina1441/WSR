package com.example.wsr

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color.alpha
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.time.LocalDate

class MainActivity : AppCompatActivity(), View.OnClickListener {

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //работа с датой через библиотеку LocalDate
        // LocalTime - только время
        // LocalDateTime - и время и дата
        var textView : TextView = findViewById(R.id.data)
        textView.text = LocalDate.now().toString()

        val goBanks: ImageView = findViewById(R.id.place)
        goBanks.setOnClickListener(this)


    }
    override fun onClick(v: View?) {
        val goBanks: ImageView = findViewById(R.id.place)
        var animAlpha: Animation = AnimationUtils.loadAnimation(this, R.anim.alpha)
        goBanks.startAnimation(animAlpha)

        val intent = Intent(this, ListActivity::class.java)
        startActivity(intent)
    }
}
