package com.belalshatara.memonote

import android.service.autofill.OnClickAction
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable

@Composable
fun AppBar(
    onNavigationIconClick : () -> Unit
) {
    TopAppBar(
        title = {
            Text(text = "Memo")
        },
        backgroundColor = MaterialTheme.colors.primary,
        contentColor = MaterialTheme.colors.secondary,
        navigationIcon = {
            IconButton(onClick = onNavigationIconClick) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Toggle" )
            }
        }

    )
}