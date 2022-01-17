package com.example.composeintagramprofilescreen

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(){
    var selectedTabIndex by remember{
        mutableStateOf(0)
    }

    Column(modifier = Modifier.fillMaxSize()) {
        TopBar(
            name = "Tillern Instagram UI",
            modifier = Modifier.padding(10.dp),
        )
        Spacer(modifier = Modifier.height(4.dp))
        ProfileSection()
        Spacer(modifier = Modifier.height(25.dp))
        ButtonSection()
        Spacer(modifier = Modifier.height(25.dp))
        HighlightSection(
            highlights = listOf(
                ImageWithText(
                    image = painterResource(id = R.drawable.seventeen),
                    text = "Kotlin"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.five),
                    text = "Kotlin"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.four),
                    text = "Kotlin"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.fourteen),
                    text = "Kotlin"
                )
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))
        PostTabView(
            imageWithTexts = listOf(
                    ImageWithText(
                        image = painterResource(id = R.drawable.seven),
                        text = "Posts"
                    ),
                ImageWithText(
                    image = painterResource(id = R.drawable.sixteen),
                    text = "Reels"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.seven),
                    text = "IG TV"
                ),
                ImageWithText(
                    image = painterResource(id = R.drawable.six),
                    text = "Profile"
                ),
            )
        ){
            selectedTabIndex = it
        }

        when(selectedTabIndex){
            0 -> PostSection(
                posts = listOf(
                    painterResource(id = R.drawable.two),
                    painterResource(id = R.drawable.twelve),
                    painterResource(id = R.drawable.thirteen),
                    painterResource(id = R.drawable.eleven),
                    painterResource(id = R.drawable.nine),
                    painterResource(id = R.drawable.ten),
                ),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun TopBar(name: String) {


}

@Composable
fun ProfileSection(){}

@Composable
fun ButtonSection(){

}

@Composable
fun HighlightSection(highlights: List<ImageWithText>) {

}

@Composable
fun PostTabView(imageWithTexts: List<ImageWithText>, function: () -> Unit) {

}