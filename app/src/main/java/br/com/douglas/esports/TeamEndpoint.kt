package br.com.douglas.esports

import retrofit2.Call
import retrofit2.http.GET

interface TeamEndpoint {

    @GET("teams")
    fun getTeam(): Call<List<Team>>

}