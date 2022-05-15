package br.com.douglas.esports

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import br.com.douglas.esports.databinding.FragmentPlayersListBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class PlayersListFragment : Fragment() {

    private lateinit var binding: FragmentPlayersListBinding
    private lateinit var adapter: PlayersListAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPlayersListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = PlayersListAdapter()
        binding.rvPlayerslist.adapter = adapter

        getData()

        binding.btnAdicionarPlayer.setOnClickListener {
            findNavController().navigate(R.id.goToPlayerBottomSheet)
        }

    }

    private fun getData() {
        val retrofitClient = NetworkUtils
            .getRetrofitInstance()

        val endpoint = retrofitClient.create(PlayersEndpoint::class.java)
        val callback = endpoint.getPlayers()

        callback.enqueue(object : Callback<List<Player>> {

            override fun onFailure(call: Call<List<Player>>, t: Throwable) {
                Toast.makeText(context, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Player>>, response: Response<List<Player>>) {
                val playerList = response.body()
                adapter.submitList(playerList)
            }
        })
    }

}