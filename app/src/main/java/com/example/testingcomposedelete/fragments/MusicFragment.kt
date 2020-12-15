package com.example.testingcomposedelete.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.imageFromResource
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.testingcomposedelete.R

class MusicFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                val navController  = rememberNavController()
                Column {
                    MakeTopAppBar(title = "Music Fragment")

                    var imageModifier = androidx.compose.ui.Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                    Image(
                        modifier =  imageModifier,
                        bitmap = imageFromResource(res = requireContext().resources,
                            resId = R.drawable.music)
                    )

                    Text(text = "Simple Received Text")
                    
                    Button(onClick = {
                        navController.popBackStack()
                    }) {
                        Text(text = "Pop Up Back Stack")
                    }
                }
            }
        }
    }
}

@Composable
private fun MakeTopAppBar(title : String){
    TopAppBar(
        title = {
            Text(
                text = title,
                color = Color.Black,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Serif,
                fontSize = TextUnit.Sp(16)
            )
        },
        backgroundColor = Color.White,
        elevation = 12.dp,

        )
}