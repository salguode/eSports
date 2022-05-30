package br.com.douglas.esports

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.douglas.esports.databinding.ItemTeamListBinding

class TeamListAdapter: ListAdapter<Team, TeamListAdapter.TeamViewHolder>(TeamListAdapterCallBack()) {

    class TeamViewHolder(
       private var binding: ItemTeamListBinding

        ): RecyclerView.ViewHolder(binding.root) {
        fun bind(team: Team){
            binding.txtTeam.text = team.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        val itemBinding = ItemTeamListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TeamViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}

class TeamListAdapterCallBack: DiffUtil.ItemCallback<Team>() {
    override fun areItemsTheSame(oldItem: Team, newItem: Team): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Team, newItem: Team): Boolean {
        return oldItem == newItem
    }

}

