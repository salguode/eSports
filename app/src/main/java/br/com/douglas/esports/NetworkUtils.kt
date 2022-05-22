package br.com.douglas.esports

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    companion object {

        fun getRetrofitInstance() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/f7706a24839c4a7899cdc2aa0f013478/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}