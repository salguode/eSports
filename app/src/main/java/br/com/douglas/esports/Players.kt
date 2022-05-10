package br.com.douglas.esports

import com.google.gson.annotations.SerializedName

data class Players(
    @SerializedName("playerName")
    val name: String,
    @SerializedName("teamId")
    val id: String,
)
