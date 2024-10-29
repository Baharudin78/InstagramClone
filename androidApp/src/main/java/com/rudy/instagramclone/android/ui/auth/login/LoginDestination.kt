package com.rudy.instagramclone.android.ui.auth.login

import androidx.compose.runtime.Composable
import androidx.navigation.Navigator
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import org.koin.androidx.compose.koinViewModel

@Destination
@Composable
fun LoginNavigation(
    navigator: DestinationsNavigator
) {
    val viewModel: LoginViewModel = koinViewModel()
    LoginScreen(
        uiState = viewModel.uiState,
        onUsernameChange = viewModel::updateUsername,
        onPasswordChange = viewModel::updatePassword
    )
}