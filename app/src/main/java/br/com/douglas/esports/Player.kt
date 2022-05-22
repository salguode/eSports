package br.com.douglas.esports

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlin.String

@Parcelize
data class Player(
    @SerializedName("playerName")
    val name: String,
    @SerializedName("_id")
    val id: String? = null
): Parcelable
