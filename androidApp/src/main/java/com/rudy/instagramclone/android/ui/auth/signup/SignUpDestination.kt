package com.rudy.instagramclone.android.ui.auth.signup

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import com.rudy.instagramclone.android.ui.auth.destinations.LoginNavigationDestination
import org.koin.androidx.compose.koinViewModel

@Destination(start = true)
@Composable
fun SignUpNavigation(
    navigator: DestinationsNavigator
) {
    val viewModel: SignUpViewModel = koinViewModel()
    SignUpScreen(
        uiState = viewModel.uiState,
        onUsernameChange = viewModel::updateUsername,
        onEmailChange = viewModel::updateEmail,
        onPasswordChange = viewModel::updatePassword,
        onNavigateToLogin = {
            navigator.navigate(LoginNavigationDestination)
        }
    )
}
