package br.com.douglas.esports

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.douglas.esports.databinding.FragmentPlayersListBinding
import br.com.douglas.esports.databinding.ItemPlayersListBinding


class PlayersListAdapter : ListAdapter<Player, PlayersListAdapter.PlayersViewHolder>(PlayersListAdapter) {



    class PlayersViewHolder(
        private var  binding: ItemPlayersListBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(player: Player){
            binding.txtPlayer.text = player.name

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
        val itemBinding = ItemPlayersListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayersViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {
        val team = getItem(position)
        holder.bind(team)
    }

    private companion object: DiffUtil.ItemCallback<Player>(){

        override fun areItemsTheSame(oldItem: Player, newItem: Player): Boolean {
            return  oldItem.id == newItem.id

        }

        override fun areContentsTheSame(oldItem: Player, newItem: Player): Boolean {
            return  oldItem == newItem
        }


    }

}


