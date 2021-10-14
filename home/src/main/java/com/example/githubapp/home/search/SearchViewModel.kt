package com.example.githubapp.home.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.githubapp.core.routing.Router
import com.example.githubapp.domain.user.User
import com.example.githubapp.domain.user.UserUseCase
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SearchViewModel(
        private val userUseCase: UserUseCase,
        private val router: Router,
) : ViewModel(), SearchAdapter.OnUserTap {

    private val _usersData = MutableLiveData<List<User>>()
    val userData: LiveData<List<User>> = _usersData

    private var searchFireJob: Job? = null

    fun searchTextChanged(phrase: String) {
        searchFireJob?.cancel()
        if (phrase.isEmpty()) {
            _usersData.value = emptyList()
            return
        }
        searchFireJob = viewModelScope.launch {
            delay(500)
            val users = userUseCase.searchUser(phrase)
            _usersData.value = users
        }
    }

    override fun onUserTap(user: User) {
        router.toProfile(user)
    }
}