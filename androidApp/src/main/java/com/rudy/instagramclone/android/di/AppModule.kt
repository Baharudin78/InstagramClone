package com.rudy.instagramclone.android.di

import androidx.lifecycle.viewmodel.compose.viewModel
import com.rudy.instagramclone.android.ui.auth.login.LoginViewModel
import com.rudy.instagramclone.android.ui.auth.signup.SignUpViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { LoginViewModel() }
    viewModel { SignUpViewModel() }
}