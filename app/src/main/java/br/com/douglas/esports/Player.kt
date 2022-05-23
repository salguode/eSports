package br.com.douglas.esports

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import kotlin.String

@Parcelize
data class Player(
    @SerializedName("name")
    val name: String,
    @SerializedName("id")
    val id: Int? = null
): Parcelable
