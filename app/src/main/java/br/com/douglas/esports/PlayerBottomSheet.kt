package br.com.douglas.esports

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.douglas.esports.databinding.PlayerBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PlayerBottomSheet : BottomSheetDialogFragment() {

    private lateinit var binding: PlayerBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = PlayerBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnAddPlayer.setOnClickListener {
            val playerName = binding.edtPlayer.text
            val player = Player(playerName.toString())

            postPlayer(player)
        }
    }


    private fun postPlayer(player: Player) {

        val retrofitClient = NetworkUtils.getRetrofitInstance()

        val endpoint = retrofitClient.create(PlayersEndpoint::class.java)
        val callback = endpoint.postPlayer(player)

        callback.enqueue(
            object : Callback<Player> {
                override fun onFailure(call: Call<Player>, t: Throwable) {
                    Log.i("Salguod", "Error")
                }
                override fun onResponse(call: Call<Player>, response: Response<Player>) {
                    setNavigationResult("")
                    dismiss()
                }
            }
        )
    }
}