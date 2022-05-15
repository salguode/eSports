package br.com.douglas.esports

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.douglas.esports.databinding.PlayerBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PlayerBottomSheet: BottomSheetDialogFragment() {

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
        }
    }
}