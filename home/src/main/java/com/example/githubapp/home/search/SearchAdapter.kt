package com.example.githubapp.home.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.githubapp.domain.user.User
import com.example.githubapp.home.databinding.SearchItemBinding

internal class SearchAdapter : RecyclerView.Adapter<SearchAdapter.ViewHolder>() {
    var users: List<User> = emptyList()
    var userTapListener: OnUserTap? = null

    internal class ViewHolder(private val binding: SearchItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(user: User) = binding.run {
            avatarView.load(user.avatar)
            login.text = user.login
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
            SearchItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = users[position]
        holder.bind(user)
        holder.itemView.setOnClickListener { userTapListener?.onUserTap(user) }
    }

    override fun getItemCount() = users.size

    interface OnUserTap {
        fun onUserTap(user: User)
    }
}