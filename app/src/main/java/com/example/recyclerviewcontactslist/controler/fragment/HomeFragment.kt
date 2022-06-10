package com.example.recyclerviewcontactslist.controler.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import coil.load
import com.example.recyclerviewcontactslist.R
import com.example.recyclerviewcontactslist.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonNextPhoto.setOnClickListener {
            populateImage()
        }

        binding.buttonContactsList.setOnClickListener {
            findNavController().navigate(R.id.action_HomeFragment_to_ContactsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun populateImage() {
        binding.imageViewFirst.load("https://picsum.photos/id/${rand(0, 100)}/200/300")

    }

    private fun rand(from: Int, to: Int): Int {
        val random = java.util.Random()
        return random.nextInt(to - from) + from
    }
}