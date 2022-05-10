package br.com.douglas.esports

import retrofit2.Call
import retrofit2.http.GET

interface PlayersEndpoint {

    @GET("Players")
    fun getPlayers(): Call<List<Players>>
}