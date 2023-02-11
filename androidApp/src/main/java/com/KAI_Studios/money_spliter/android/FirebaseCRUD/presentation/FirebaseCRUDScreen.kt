package com.KAI_Studios.money_spliter.android.FirebaseCRUD.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.KAI_Studios.money_spliter.android.FirebaseCRUD.presentation.components.BasicInputField


@Composable
fun FirebaseCRUDScreen(
    modifier: Modifier = Modifier,

){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(5.dp)) {
        Text(text = "CRUD Screen", style = MaterialTheme.typography.h1)
        Row(modifier = Modifier) {
            BasicInputField(
                    modifier = Modifier.weight(1f),
                    request = "Name",
                    onTextChange = { TODO("Implement ViewModel") }
            )
            Spacer(modifier = Modifier.width(10.dp))
            BasicInputField(
                    modifier = Modifier.weight(1f),
                    request = "Email",
                    onTextChange = { TODO("Implement ViewModel") }
            )

        }
        Spacer(modifier = Modifier.height(10.dp))
        BasicInputField(
                modifier= Modifier.fillMaxWidth(),
                request = "Cvu",
                onTextChange = {TODO("Implement ViewModel")}
        )
        Spacer(modifier = Modifier.height(10.dp))
        BasicInputField(
                modifier= Modifier.fillMaxWidth(),
                request = "Mail",
                onTextChange = {TODO("Implement ViewModel")}
        )
        Spacer(modifier = Modifier.height(30.dp))
        BasicInputField(
                modifier= Modifier.fillMaxWidth(),
                request = "Password",
                onTextChange = {TODO("Implement ViewModel")}
        )


    }
}