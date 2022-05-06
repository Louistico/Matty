package com.example.matty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Clients : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clients)
    }
    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://dog.ceo/api/breeds/image/random")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    private fun searchByName(query: String) {
        doAsync {
            val call = getRetrofit().create(APIService::class.java).getClient("$query").execute()
            val client = call.body() as ClientsResponse
            uiThread {
                if(client.status == "success") {
                    initCharacter(client)
                }else{
                    showErrorDialog()
                }
                hideKeyboard()
            }
        }
    }
}