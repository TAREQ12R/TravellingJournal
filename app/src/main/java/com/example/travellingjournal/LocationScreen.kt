package com.example.travellingjournal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travellingjournal.databinding.LocationScreenBinding

class LocationScreen : Fragment() {
    lateinit var binding: LocationScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding=LocationScreenBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            notesRecyclerView.layoutManager=LinearLayoutManager(requireContext())
            addNoteButton.setOnClickListener{

                findNavController().navigate(R.id.addNote)
            }
        }
    }


}