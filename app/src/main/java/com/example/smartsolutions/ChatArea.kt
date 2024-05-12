package com.example.smartsolutions

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import com.example.smartsolutions.compo.ChatFooter
import com.example.smartsolutions.compo.ChatHeader
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.smartsolutions.compo.ChatList


@Composable
fun ChatArea(
    viewModel: ChatAreaVM= viewModel()
) {
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    )
    {

        ChatHeader()

        Box(modifier = Modifier.weight(1f),
        contentAlignment = Alignment.Center )
        {
            if(viewModel.list.isEmpty()){
                Text(text = "No Chats Available!!", color= Color(0xFF4D0679))
            }
            ChatList(list = viewModel.list)
        }


        ChatFooter {

            if(it.isNotEmpty()) {

                viewModel.sendmessage(it)
            }
        }
    }
}