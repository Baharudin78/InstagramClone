package com.rudy.instagramclone.android.ui.auth.signup

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel : ViewModel() {

    var uiState by mutableStateOf(SignUpUIState())
        private set
    fun updateUsername(userNameInput : String) {
        uiState = uiState.copy(username = userNameInput)
    }

    fun updateEmail(emailInput : String) {
        uiState = uiState.copy(email = emailInput)
    }

    fun updatePassword(passwordInput : String) {
        uiState = uiState.copy(password = passwordInput)
    }

}