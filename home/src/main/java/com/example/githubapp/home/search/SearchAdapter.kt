package com.example.githubapp.home.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.githubapp.domain.user.User
import com.example.githubapp.home.databinding.SearchItemBinding

internal class SearchAdapter : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {
    var users: List<User> = emptyList()

    internal class ViewHolder(private val binding: SearchItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) = binding.run {
            fullName.text = user.id.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
            SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(users[position])
    }

    override fun getItemCount() = users.size
}