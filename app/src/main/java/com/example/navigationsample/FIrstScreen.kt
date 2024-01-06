package com.example.navigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
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
fun FirstScreen(
    /*this part indicates that first screen function take a block of code or function as parameter which
    has no parameter and no return type
     in kotlin we can declare a function as a parameter of another function, and we can declere a
     funtion without using ()
    which means we can declare a function without calling it, the following code just specifies the type of the
    function without calling it. :()-> unit, here empty brackets means no parameters and unit means void
    so that part gives the type of the function, a change was made later to send data to the second screen
    we just give that data as parameter to the call of the navigation function which takes us to second screen*/
    navigateToSecondScreen:(String,String)->Unit
) {
    val name = remember {
        mutableStateOf("")
    }
    val age = remember {
        mutableStateOf("0")
    }
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text("this is the first Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = name.value,//name varible is the value of this feild
            onValueChange = {
                name.value = it
            },//and the changed value "it" is assigned to name.value
            label = { Text("Enter your name") }
            ,singleLine = true
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = age.value,//age varible is the value of this feild
            onValueChange = { age.value = it },//and the changed value "it" is assigned to name.value
            label = { Text("Enter your age") }
        )
        Button(onClick = {
            //here we will add the navigation code
            if(name.value.isEmpty()){
                name.value = "no name"
            }
            navigateToSecondScreen(name.value,age.value)
        }) {
            Text("Go to next screen")
        }
    }

}
//@Preview(showBackground = true)
//@Composable
//fun FirstScreenPreview() {
//    NavigationSampleTheme {
//        FirstScreen({})
//    }
//}