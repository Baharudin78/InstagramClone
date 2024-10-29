package com.rudy.instagramclone.android.ui.auth.login

import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.rudy.instagramclone.android.R
import com.rudy.instagramclone.android.common.component.CustomTextField
import com.rudy.instagramclone.android.theme.ButtonHeight
import com.rudy.instagramclone.android.theme.ExtraLargeSpacing
import com.rudy.instagramclone.android.theme.InstagramAppTheme
import com.rudy.instagramclone.android.theme.LargeSpacing
import com.rudy.instagramclone.android.theme.MediumSpacing

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    uiState: LoginUIState,
    onUsernameChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .background(
                color = if (isSystemInDarkTheme()) {
                    MaterialTheme.colorScheme.background
                } else {
                    MaterialTheme.colorScheme.surface
                }
            )
            .padding(
                top = ExtraLargeSpacing + LargeSpacing,
                start = LargeSpacing + MediumSpacing,
                end = LargeSpacing + MediumSpacing,
                bottom = LargeSpacing
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(LargeSpacing)
    ) {
        CustomTextField(
            value = uiState.username,
            onValueChange = onUsernameChange,
            hint = R.string.username_hint
        )
        CustomTextField(
            value = uiState.password,
            onValueChange = onPasswordChange,
            hint = R.string.password_hint,
            keyboardType = KeyboardType.Password,
            isPasswordTextField = true
        )
        Button(
            onClick = { },
            modifier = modifier
                .fillMaxWidth()
                .height(ButtonHeight),
            elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp),
            shape = MaterialTheme.shapes.medium
        ) {
            Text(text = stringResource(id = R.string.login_label))

        }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    InstagramAppTheme {
        LoginScreen(uiState = LoginUIState(), onUsernameChange = {}, onPasswordChange = {})
    }
}