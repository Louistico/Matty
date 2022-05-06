package com.example.matty

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.matty.ui.sale.SaleFragment

class Copy : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paymentcopy)


    }
    fun onClickCobrar(view: View){
        val intentCobrar= Intent(this,ConfirmP::class.java)
        startActivity(intentCobrar)
    }
    fun onClickSale(view:View){
        val intentSale=Intent(this, Menu::class.java)
        startActivity(intentSale)

    }

}