package com.example.matty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class Login : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


    }
    fun OnClickPass(view: View){
        val intentMenu= Intent(this, com.example.matty.Menu::class.java)
        startActivity(intentMenu)

    }

}
