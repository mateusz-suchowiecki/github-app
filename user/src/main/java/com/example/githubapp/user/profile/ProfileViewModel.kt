package com.example.githubapp.user.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubapp.domain.user.User
import com.example.githubapp.domain.user.UserDetails
import com.example.githubapp.domain.user.UserUseCase
import kotlinx.coroutines.launch

class ProfileViewModel(
        private val userUseCase: UserUseCase
) : ViewModel() {

    private val _userData = MutableLiveData<UserDetails>()
    val userData: LiveData<UserDetails> = _userData

    fun initialize(user: User) {
        viewModelScope.launch {
            _userData.value = userUseCase.getUserDetails(user.login)
        }
    }

}