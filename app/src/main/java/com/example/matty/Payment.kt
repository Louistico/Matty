package com.example.matty

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.matty.ui.sale.SaleFragment

class Payment : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paymentmethods)



    }

    fun Return(view:View){
       val intentRet=Intent(this,Menu::class.java)
        startActivity(intentRet)
    }

    fun onClickMethods(view: View){
        val intentconfirm= Intent(this, ConfirmP::class.java)
        startActivity(intentconfirm)

    }

}