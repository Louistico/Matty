package com.example.matty

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {
    @GET
    fun getClient(@Url url:String): Call<ClientsResponse>
}