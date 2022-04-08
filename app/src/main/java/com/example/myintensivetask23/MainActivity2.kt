package com.example.myintensivetask23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myintensivetask23.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    lateinit var binding: ActivityMain2Binding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
    }

    private fun initViews(){
        with(binding){
            val count = intent.getIntExtra("COUNTER", 0)
            tvShowCount2.text = count.toString()

            val receive = intent.getStringExtra("GO")
            tvHello.text = receive
        }
    }

}