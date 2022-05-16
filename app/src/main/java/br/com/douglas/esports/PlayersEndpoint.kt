package br.com.douglas.esports

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface PlayersEndpoint {

    @GET("players")
    fun getPlayers(): Call<List<Player>>

    @POST("players")
    fun postPlayer(@Body player: Player): Call<Player>
}