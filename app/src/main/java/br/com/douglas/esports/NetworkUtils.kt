package br.com.douglas.esports

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    companion object {

        fun getRetrofitInstance() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/243a4e906ecf4f77b85b4367991437ac/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}