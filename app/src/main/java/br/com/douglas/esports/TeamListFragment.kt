package br.com.douglas.esports

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.douglas.esports.databinding.FragmentTeamListBinding


class TeamListFragment : Fragment() {

    private lateinit var binding: FragmentTeamListBinding
    private lateinit var adapter: TeamListAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentTeamListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        adapter = TeamListAdapter()
        binding.rvTeamList.adapter = adapter
        adapter.submitList(getMockTeam())


    }

    fun getMockTeam()= listOf(
        Team(
            id = "555",
            name = "Fallen"
        ),
        Team(
            id = "789",
            name = "Amendoim"
        ),
        Team(
            id = "123",
            name = "Sacy"
        ),
        Team(
            id = "666",
            name = "Aspas"
        )
    )


}