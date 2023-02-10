package com.KAI_Studios.money_spliter.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.KAI_Studios.money_spliter.Greeting
import com.KAI_Studios.money_spliter.android.FirebaseCRUD.presentation.FirebaseCRUDScreen
import com.KAI_Studios.money_spliter.android.core.presentation.Screen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MoneySpliterRoot()
                }
            }
        }
    }
}

@Composable
fun MoneySpliterRoot() {

    val navController = rememberNavController()

    NavHost(
            navController = navController,
            startDestination = Screen.FirebaseCRUDScreen.route
    ){

        composable(
                route = Screen.FirebaseCRUDScreen.route,
        ){
            FirebaseCRUDScreen()
        }

    }


}


@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@Preview
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        GreetingView("Hello, Android!")
    }
}
