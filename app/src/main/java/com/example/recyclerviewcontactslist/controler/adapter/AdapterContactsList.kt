package com.example.recyclerviewcontactslist.controler.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.recyclerviewcontactslist.databinding.LayoutRecyclerViewBinding
import com.example.recyclerviewcontactslist.model.User

class AdapterContactsList : RecyclerView.Adapter<AdapterContactsList.ViewHolderContactsList>() {

    private var contactList: MutableList<User> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderContactsList {
        val itemBinding = LayoutRecyclerViewBinding.inflate(LayoutInflater.from(parent.context))
        return ViewHolderContactsList(itemBinding)
    }

    override fun onBindViewHolder(holder: ViewHolderContactsList, position: Int) {
        holder.onBind(contactList[position])
    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    @SuppressLint("NotifyDataSetChanged")
    fun setData(contactListAux: List<User>) {
        contactList.clear()
        contactList.addAll(contactListAux)
        notifyDataSetChanged()
    }

    class ViewHolderContactsList(val layout: LayoutRecyclerViewBinding) :
        RecyclerView.ViewHolder(layout.root) {
        fun onBind(user: User) {
            layout.textViewNameContactDescription.text = user.name
            layout.textViewPhoneContactDescription.text = user.phone.toString()
            layout.textViewEmailContactDescription.text = user.email
            layout.imageViewContact.load("https://picsum.photos/id/${rand(0, 100)}/200/300")
        }

        private fun rand(from: Int, to: Int): Int {
            val random = java.util.Random()
            return random.nextInt(to - from) + from
        }
    }
}

