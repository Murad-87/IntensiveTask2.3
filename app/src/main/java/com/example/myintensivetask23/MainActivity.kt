package com.example.myintensivetask23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.myintensivetask23.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var counter = 0

        with(binding){
            buttonCount.setOnClickListener {
                counter++
                showCount.text = counter.toString()
            }
        }

        binding.buttonToast.setOnClickListener {
            val intent = Intent (this, MainActivity2::class.java)
            intent.putExtra("COUNTER", counter )
            intent.putExtra("GO", "Hello!")
            startActivity(intent)
        }
    }

}