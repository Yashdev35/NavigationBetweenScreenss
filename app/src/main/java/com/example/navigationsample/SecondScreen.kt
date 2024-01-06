package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigationsample.ui.theme.NavigationSampleTheme
//for second scr to receive the data given by the 1st screen we add the type of the data as parameter to fun second scr
@Composable
fun SecondScreen(name : String,age : String, navigateToThirdScreen:()->Unit) {
    val namee = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("this is the Second Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("welcome $name and your age is $age", fontSize = 24.sp)
        Button(onClick = {
            //here we will add the navigation code
            navigateToThirdScreen()
        }) {
            Text("Go to next screen")
        }
    }

}
@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    NavigationSampleTheme {
        SecondScreen("Yash is manece to society","0",{})
}
}