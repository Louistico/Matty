package com.example.matty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import com.example.matty.databinding.ActivityConfigurarBinding

class Configurar : AppCompatActivity() {
    private lateinit var binding: ActivityConfigurarBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConfigurarBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }


}