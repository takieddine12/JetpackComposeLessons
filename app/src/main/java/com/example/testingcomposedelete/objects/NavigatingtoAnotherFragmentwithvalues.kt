package com.example.testingcomposedelete.objects

class NavigatingtoAnotherFragmentwithvalues {

    /*
      override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return ComposeView(requireContext()).apply {
                 setContent {
                     Column {
                        NavigateToNextDestination(requireContext())
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
private fun NavigateToNextDestination(context: Context){
    val navController =  rememberNavController()
    NavHost(navController, startDestination = "home/{age}/{name}") {
        composable("home/{age}/{name}",
        arguments = listOf(navArgument("age"){
            type = NavType.IntType
        })){ navBackStack->
            HomeScreen(context, navController,
                navBackStack.arguments?.getString("name") ?: "default",
                navBackStack.arguments?.getInt("age") ?: 0 )
        }
        composable("music/{age}/{name}",
        arguments = listOf(navArgument("age"){
            type = NavType.IntType
        })) {
           MusicScreen(context,navController,
           it.arguments?.getString("name")!!,
           it.arguments!!.getInt("age"))
        }
        composable("waves"){
            WavesScreen(context = context, navController = navController)
        }
    }
}


@Composable
fun HomeScreen( context: Context , navController : NavHostController,value : String,age : Int){
    Column {
        MakeTopAppBar(title = "Home Screen")

        val imageModifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .height(200.dp)
            .clip(shape = RoundedCornerShape(topLeft = 8.dp,topRight = 8.dp,bottomLeft = 8.dp,bottomRight = 8.dp))
            .padding(top = 20.dp,start = 10.dp,end = 10.dp,bottom = 0.dp)
        Image(
            modifier =  imageModifier,
            contentScale = ContentScale.Crop,
            bitmap = imageFromResource(res = context.resources,
                resId = R.drawable.home))

        // TODO : Set up recyclcerview

        val listAnimals = listOf(
            "Dog","Cat","Gazelle","Lion","Tiger","Bear","Leopard","Snake","Bird",
            "Duck","Mosquito","Elephan","Giraffe","Hypo","Squirrel","Mouse","Gazelle",

        )

       LazyColumnFor(
           modifier = androidx.compose.ui.Modifier.padding(15.dp)
               .fillMaxWidth()
               .fillMaxHeight(),
           items = listAnimals
       ) {item ->


           Text(text = "${item}",
               modifier = androidx.compose.ui.Modifier
                   .padding(top = 5.dp)
                   .clickable(onClick = {
                       navController.navigate("music/${1 + 25}/takeddine"){
                       }
                   })
           )

           Divider()
           Spacer(modifier = androidx.compose.ui.Modifier.
           padding(top = 3.dp))
       }
    }
}


@Composable
fun MusicScreen( context : Context , navController: NavHostController,value : String , age : Int){

    MakeTopAppBar(title = "Music Screen")
    val imageModifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
        .height(200.dp)
        .clip(shape = RoundedCornerShape(size = 25.dp))
        .padding(top = 20.dp,start = 10.dp,end = 10.dp,bottom = 0.dp)
    Image(
        modifier =  imageModifier,
        contentScale = ContentScale.Crop,
        bitmap = imageFromResource(res = context.resources,
            resId = R.drawable.music))

    Text(
        text = "My Name is $value",
        modifier = androidx.compose.ui.Modifier.
        padding(top = 30.dp)
    )

    Text(
        text = "My Age is $age",
        modifier = androidx.compose.ui.Modifier.
        padding(top = 30.dp)
    )


    Button(
        modifier = androidx.compose.ui.Modifier
            .padding(start = 100.dp,top = 20.dp),
        onClick = {
            navController.popBackStack()
        }) {
        Text(text = "Move Back")


    }
}

@Composable
fun WavesScreen(context: Context,navController: NavHostController){
    MakeTopAppBar(title = "Waves Screen")
    val imageModifier = androidx.compose.ui.Modifier
        .fillMaxWidth()
        .height(200.dp)
        .clip(shape = RoundedCornerShape(size = 25.dp))
        .padding(top = 20.dp,start = 10.dp,end = 10.dp,bottom = 0.dp)
    Image(
        modifier =  imageModifier,
        contentScale = ContentScale.Crop,
        bitmap = imageFromResource(res = context.resources,
            resId = R.drawable.wavs))
    Button(
        modifier = androidx.compose.ui.Modifier
            .padding(start = 100.dp,top = 20.dp),
        onClick = {
            navController.popBackStack()
        }) {
        Text(text = "Move Back")
    }
}
     */
}