package com.example.bottomnavigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.bottomnavigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttomNavigation.setOnItemSelectedListener {
            Toast.makeText(this, "Clicked : $it", Toast.LENGTH_SHORT).show()
            return@setOnItemSelectedListener true
        }
    }
}