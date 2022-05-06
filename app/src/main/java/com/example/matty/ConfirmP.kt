package com.example.matty

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.matty.ui.sale.SaleFragment

class ConfirmP : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.confirmpayment)


    }
    fun onClickAtras(view: View){
       val intentMethods=Intent(this,Payment::class.java)
        startActivity(intentMethods)
    }


    fun onClickCopy(view: View){
        val intentconfirm= Intent(this, Copy::class.java)
        startActivity(intentconfirm)

    }





}