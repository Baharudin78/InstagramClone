package com.rudy.instagramclone.android.ui.auth.login

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    var uiState by mutableStateOf(LoginUIState())
        private set

    fun updateUsername (usernameInput : String) {
        uiState = uiState.copy(usernameInput)
    }
    fun updatePassword(passwordInput : String) {
        uiState = uiState.copy(passwordInput)
    }
}