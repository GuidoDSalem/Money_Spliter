package com.KAI_Studios.money_spliter.android.FirebaseCRUD.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun UserTextField(
    modifier: Modifier = Modifier,
    request: String,
    text: String = "",
    onTextChange: (String)-> Unit,
    focusColor: Color = Color.Cyan,
    isSensitive: Boolean = false

){
    var isFocused by remember{
        mutableStateOf(false)
    }
    Column(modifier = modifier
        .clip(RoundedCornerShape(10.dp))
        .background(Color.White)
        .border(
                BorderStroke(
                        2.dp,
                        if(isFocused)focusColor else Color.Gray
                )
        )
        .shadow(
                3.dp,
                RoundedCornerShape(10.dp)
        )
        .padding(8.dp)
        .onFocusChanged { isFocused = it.isFocused }
    ) {
        Text(
                text = request,
                style = MaterialTheme.typography.body1,
                color = if(isFocused)focusColor else Color.Gray
        )
        BasicTextField(
                value = text,
                onValueChange = onTextChange
        )

    }



}
/*modifier = Modifier
.clip(RoundedCornerShape(10.dp))
.border(
BorderStroke(
2.dp,
focusColor
)
)
.shadow(3.dp),*/

@Preview
@Composable
fun PrevBasicTextField() {
    UserTextField(
            modifier = Modifier.fillMaxWidth(),
            request = "Name",
            text = "Guido David Salem",
            onTextChange = {
                Unit
            },

    )

}