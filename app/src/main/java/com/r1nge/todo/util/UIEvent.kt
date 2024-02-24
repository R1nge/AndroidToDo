package com.r1nge.todo.util

import androidx.compose.material3.SnackbarDuration

sealed class UIEvent {
    object PopBackStack : UIEvent()
    data class Navigate(val route: String) : UIEvent()
    data class ShowSnackbar(
        val message: String,
        val action: String? = null,
        val duration: SnackbarDuration = SnackbarDuration.Short
    ) : UIEvent()
}