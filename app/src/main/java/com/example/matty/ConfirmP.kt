package com.example.matty

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ConfirmP : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.confirmpayment)


    }


    fun onClickCopy(view: View){
        val intentconfirm= Intent(this, Copy::class.java)
        startActivity(intentconfirm)

    }




    }