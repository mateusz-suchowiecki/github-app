package com.example.github.user

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.githubapp.domain.user.User
import com.example.githubapp.domain.user.UserDetails

class ProfileViewModel : ViewModel() {

    private val _userData = MutableLiveData<UserDetails>()
    val userData: LiveData<UserDetails> = _userData

    fun initialize(user: User) {

    }

}