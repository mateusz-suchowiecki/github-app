package com.example.githubapp.home.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubapp.domain.user.UserUseCase
import kotlinx.coroutines.launch

class SearchViewModel(
        private val userUseCase: UserUseCase,
) : ViewModel() {

    fun findUser(phrase: String) {
        viewModelScope.launch {
            val users = userUseCase.searchUser(phrase)
            Log.i("users", users.toString())
        }
    }
}