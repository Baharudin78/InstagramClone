package com.rudy.instagramclone.android.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.rudy.instagramclone.android.R

val Lexend = FontFamily(
    Font(R.font.lexend_medium, FontWeight.Medium),
    Font(R.font.lexend_semibold, FontWeight.SemiBold),
    Font(R.font.lexend_bold, FontWeight.Bold)
)
val OpenSans = FontFamily(
    Font(R.font.opensans_light, FontWeight.Light),
    Font(R.font.opensans_reguler, FontWeight.Normal)
)

val Typography = Typography(
    headlineMedium = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.Bold,
        fontSize = 21.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    titleSmall = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodySmall = TextStyle(
        fontFamily = OpenSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Lexend,
        fontWeight = FontWeight.SemiBold,
        fontSize = 15.sp
    ),
    displayMedium = TextStyle(
        fontFamily = OpenSans
    ),
    displaySmall = TextStyle(
        fontFamily = OpenSans
    )
)