package br.com.douglas.esports

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import br.com.douglas.esports.databinding.ItemPlayersListBinding


class PlayersListAdapter(
    val editCallBack: (Player) -> Unit
) : ListAdapter<Player, PlayersListAdapter.PlayersViewHolder>(PlayersListAdapter) {



    class PlayersViewHolder(
        private var  binding: ItemPlayersListBinding

    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(player: Player, editCallBack: (Player) -> Unit){
            binding.txtPlayer.text = player.name

            binding.btnUpdatePlayer.setOnClickListener {
                editCallBack(player)
            }

        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayersViewHolder {
        val itemBinding = ItemPlayersListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayersViewHolder(itemBinding)
    }

    override fun onBindViewHolder(holder: PlayersViewHolder, position: Int) {
        val team = getItem(position)
        holder.bind(team, editCallBack)
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


