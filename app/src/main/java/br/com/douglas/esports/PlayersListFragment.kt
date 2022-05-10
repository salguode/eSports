package br.com.douglas.esports

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.douglas.esports.databinding.FragmentPlayersListBinding


class PlayersListFragment : Fragment() {

    private lateinit var binding: FragmentPlayersListBinding
    private lateinit var adapter: PlayersListAdapter

   val players = listOf(
       Players("123", "Fer"),
       Players("456", "Fallen")
   )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentPlayersListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = PlayersListAdapter()
        binding.rvPlayerslist.adapter = adapter

        adapter.submitList(players)

    }

}