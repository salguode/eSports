package br.com.douglas.esports

import android.os.Parcelable
import android.util.Log
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Player(
    @SerializedName("playerName")
    val name: String,
    @SerializedName("_id")
    val id: String? = null
): Parcelable
