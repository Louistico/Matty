package com.example.matty

import com.google.gson.annotations.SerializedName

data class ClientsResponse(
    @SerializedName("status") var status:String,
    @SerializedName("message") var message:String
)

