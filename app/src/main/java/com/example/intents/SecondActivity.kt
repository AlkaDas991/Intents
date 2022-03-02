package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.databinding.ActivityMainBinding
import com.example.intents.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    companion object {
        const val NAME = "NAME"
    }
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val name = intent.getStringExtra(NAME)
        binding.showName.setText("Hi "+name)
    }

}