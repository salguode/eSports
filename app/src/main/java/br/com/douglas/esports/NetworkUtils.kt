package br.com.douglas.esports

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    companion object {

        fun getRetrofitInstance(path : String) : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/47b96a7901fa4614987d7a802cea7ce4")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}