package com.example.testingcomposedelete.objects

class ComposeMovingToNextDestination {

    /*
     override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
                 setContent {
                     Column {
                         MakeTopAppBar(title = "Home Fragment")
                         var imageModifier = androidx.compose.ui.Modifier
                             .fillMaxWidth()
                             .height(200.dp)
                         Image(
                             modifier =  imageModifier,
                             bitmap = imageFromResource(res = requireContext().resources,
                                 resId = R.drawable.home))

                         NavigateToNextDestination()
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

@Composable
private fun NavigateToNextDestination(){
    var navController = rememberNavController()
    NavHost(navController, startDestination = "home") {
        composable("home/{name}"
        , arguments = listOf(navArgument("Taki Eddine"){
                    type = NavType.StringType
            })
        ) {
            HomeFragment()
        }
        composable("music") { MusicFragment() }
    }

    Button(
        onClick = {
        navController.navigate("music")
    }) {
        Text(text = "Move Into Destination")
    }
}
     */
}