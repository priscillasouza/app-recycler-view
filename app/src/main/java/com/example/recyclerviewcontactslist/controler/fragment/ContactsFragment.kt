package com.example.recyclerviewcontactslist.controler.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewcontactslist.R
import com.example.recyclerviewcontactslist.controler.adapter.AdapterContactsList
import com.example.recyclerviewcontactslist.databinding.FragmentContactsBinding
import com.example.recyclerviewcontactslist.model.User

class ContactsFragment : Fragment() {

    private var _binding: FragmentContactsBinding? = null

    private val binding get() = _binding!!

    private lateinit var adapterRecyclerView: AdapterContactsList

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentContactsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_ContactsFragment_to_HomeFragment)
        }

        startAdapter()
        setAdapter()
    }

    private fun startAdapter() {
        binding.recyclerViewContacts.apply {
            adapterRecyclerView = AdapterContactsList()
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = adapterRecyclerView
        }
    }

    private fun setAdapter() {
        adapterRecyclerView.setData(listContacts())
    }

    private fun listContacts(): List<User> = listOf(
        User(
            name = "Maria Oliveira",
            phone = 3299504510,
            email = "mariaoliveira@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Lucas Souza",
            phone = 1198756231,
            email = "lucassouza@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Marta Ribeiro",
            phone = 3274208850,
            email = "martaribeiro23@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Sheila Melo",
            phone = 3299503852,
            email = "sheilamelo@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Maria Mercedes",
            phone = 3299503850,
            email = "mariamercedes@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Tulio Menezes",
            phone = 1999658740,
            email = "tuliomenezes10@mail.com",
            imageUrl = ""
        ),

        User(
            name = "José Silva",
            phone = 1984526983,
            email = "josesilva@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Lucas Souza",
            phone = 1198756231,
            email = "lucassouza@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Marta Ribeiro",
            phone = 3274208850,
            email = "martaribeiro23@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Sheila Melo",
            phone = 3299503852,
            email = "sheilamelo@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Maria Mercedes",
            phone = 3299503850,
            email = "mariamercedes@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Tulio Menezes",
            phone = 1999658740,
            email = "tuliomenezes10@mail.com",
            imageUrl = ""
        ),
        User(
            name = "José Silva",
            phone = 1984526983,
            email = "josesilva@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Marta Ribeiro",
            phone = 3274208850,
            email = "martaribeiro23@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Sheila Melo",
            phone = 3299503852,
            email = "sheilamelo@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Maria Mercedes",
            phone = 3299503850,
            email = "mariamercedes@mail.com",
            imageUrl = ""
        ),
        User(
            name = "Tulio Menezes",
            phone = 1999658740,
            email = "tuliomenezes10@mail.com",
            imageUrl = ""
        ),

        User(
            name = "José Silva",
            phone = 1984526983,
            email = "josesilva@mail.com",
            imageUrl = ""
        )

    )

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}