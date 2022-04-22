package com.example.matty

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import com.example.matty.databinding.ScannerBinding
import com.google.zxing.integration.android.IntentIntegrator

class Scanner : AppCompatActivity() {
    private lateinit var binding: ScannerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ScannerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnScan.setOnClickListener{ initScanner()}
    }
    private fun initScanner(){
        IntentIntegrator(this).initiateScan()
    }
}