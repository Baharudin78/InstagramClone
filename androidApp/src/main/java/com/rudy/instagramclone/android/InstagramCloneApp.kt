package com.rudy.instagramclone.android

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.NavGraph
import com.rudy.instagramclone.android.ui.auth.NavGraphs

@Composable
fun InstagramCloneApp() {
    val navController = rememberNavController()
    DestinationsNavHost(navGraph = NavGraphs.root, navController = navController)
}