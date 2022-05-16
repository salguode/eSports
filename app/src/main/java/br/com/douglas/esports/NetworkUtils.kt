package br.com.douglas.esports

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtils {

    companion object {

        fun getRetrofitInstance() : Retrofit {
            return Retrofit.Builder()
                .baseUrl("https://crudcrud.com/api/5773fea58cf647d9bdd22e59fa62b7b5/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}