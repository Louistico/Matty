package com.example.matty

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paymentmethods)



    }

    fun onClickMethods(view: View){
        val intentconfirm= Intent(this, ConfirmP::class.java)
        startActivity(intentconfirm)

    }
}