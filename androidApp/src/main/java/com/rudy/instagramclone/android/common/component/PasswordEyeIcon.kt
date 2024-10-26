package com.rudy.instagramclone.android.common.component

import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.rudy.instagramclone.android.R

@Composable
fun PasswordEyeIcon(
    isPasswordVisible: Boolean,
    onPasswordVisibilityToggle: () -> Unit
) {
    val image = if (isPasswordVisible) {
        painterResource(id = R.drawable.show_eye_icon_filled)
    } else {
        painterResource(id =R.drawable.hide_eye_icon_filled)
    }
    IconButton(onClick = onPasswordVisibilityToggle) {
        Icon(painter = image, contentDescription = "eye toggle")
    }
}