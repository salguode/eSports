package br.com.douglas.esports

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    companion object {

        fun getRetrofitInstance() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/acceb78889ec4435a38eaac20652a44f/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}