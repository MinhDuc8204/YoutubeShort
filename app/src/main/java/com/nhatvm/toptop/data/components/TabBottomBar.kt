package com.nhatvm.toptop.data.components

import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.nhatvm.toptop.data.R
import com.nhatvm.toptop.data.Routes

@Composable
fun TabBottomBar(
    selectItem: String,
    onHomeClick: () -> Unit,
    onSearchClick: () -> Unit,
    onUploadClick: () -> Unit,
    onInboxClick: () -> Unit,
    onProfileClick: () -> Unit,
){
    BottomAppBar (backgroundColor = Color.Black, contentColor = Color.White){
        BottomNavigationItem(
            selected = if (selectItem == Routes.FORYOU_SCREEN) true else false,
            onClick = onHomeClick,
            icon = { Icon(
                painter = painterResource(id = R.drawable.home_icon),
                contentDescription = "Home"
            ) },
            label = { Text(text = "Home") }
        )
        BottomNavigationItem(
            selected = if (selectItem == Routes.DISCOVER_SCREEN) true else false,
            onClick = onSearchClick,
            icon = { Icon(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search"
            ) },
            label = { Text(text = "Shorts") }
        )
        BottomNavigationItem(
            selected = true,
            onClick = onUploadClick,
            icon = { Icon(
                painter = painterResource(id = R.drawable.upload_icon),
                contentDescription = "Upload"
            ) },
        )
        BottomNavigationItem(
            selected = if (selectItem == Routes.INBOX_SCREEN) true else false,
            onClick = onInboxClick,
            icon = { Icon(
                painter = painterResource(id = R.drawable.message_icon),
                contentDescription = "Inbox"
            ) },
            label = { Text(text = "Subscipt") }
        )
        BottomNavigationItem(
            selected = if (selectItem == Routes.ME_SCREEN) true else false,
            onClick = onProfileClick,
            icon = { Icon(
                painter = painterResource(id = R.drawable.account_icon),
                contentDescription = "User"
            ) },
            label = { Text(text = "Me ") }
        )
    }
}