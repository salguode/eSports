package br.com.douglas.esports

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.*

interface PlayersEndpoint {

    @GET("players")
    fun getPlayers(): Call<List<Player>>

    @POST("players")
    fun postPlayer(@Body player: Player): Call<Player>

    @PUT("players/{id}")
    fun putPlayer(@Path("id") playerId: String, @Body player: Player): Call<ResponseBody>

    @DELETE("players/{id}")
    fun deletePlayer(@Path("id") playerId: String): Call<ResponseBody>
}