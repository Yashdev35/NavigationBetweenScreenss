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

@Composable
fun ThirdScreen(navigateToFirstScreen:()->Unit) {
    val name = remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("this is the Third Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("welcome to the Third screen", fontSize = 24.sp)
        Button(onClick = {
            //here we will add the navigation code
            navigateToFirstScreen()
        }) {
            Text("Go to next screen")
        }
    }
}
@Preview(showBackground = true)
@Composable fun ThirdScreenPreview() {
    NavigationSampleTheme {
        ThirdScreen({})
    }
}