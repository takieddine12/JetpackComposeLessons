package com.example.testingcomposedelete.objects

class ComposeDrawer {

    /*
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var scaffoldState = rememberScaffoldState()
            Column {
                Surface(color = MaterialTheme.colors.background) {
                    Scaffold(
                        scaffoldState = scaffoldState,
                        drawerShape = CutCornerShape(60.dp),
                        topBar = { provideAppBar("Jetpack Compose",scaffoldState = scaffoldState) },
                        drawerContent = { NavDrawer(this@MainActivity,scaffoldState = scaffoldState) },
                        bodyContent = {})

                }
            }
        }
    }

}



@Composable
fun NavDrawer(context : Context, scaffoldState: ScaffoldState){
    Column {
        val imageModifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
        Image(
            contentScale = ContentScale.Crop,
            modifier = imageModifier,
            bitmap = imageFromResource(
                res  = context.resources,
                resId = R.drawable.wavs
            ))

        Divider()

        NavOption(title = "Option 1", scaffoldState = scaffoldState )
        NavOption(title = "Option 2", scaffoldState = scaffoldState )
        NavOption(title = "Option 3", scaffoldState = scaffoldState )
        NavOption(title = "Option 4", scaffoldState = scaffoldState )
    }
}

@Composable
fun NavOption(title: String, scaffoldState: ScaffoldState) {

    val textModifier = Modifier
        .clickable(onClick = {
            if (scaffoldState.drawerState.isOpen) {
                scaffoldState.drawerState.close()
            }
        })
        .indication(indication = RippleIndication(
            color = Color.Yellow),interactionState = InteractionState())

    Text(
        modifier = textModifier,
        text = title,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Cursive,
    )
}

@Composable
fun provideAppBar(title: String,scaffoldState: ScaffoldState) {
    TopAppBar(
        title = { Text(text = title) },
        backgroundColor = Color.White,
        elevation = 8.dp,
        navigationIcon = {
            IconButton(onClick = { scaffoldState.drawerState.open() }) {
                Icon(imageResource(id = R.drawable.wavs))
            }
        }
    )
}


@Composable
@Preview
fun PreviewCard() {
    Card(
        modifier = Modifier
            .clip(shape = RoundedCornerShape(10.dp))
            .border(border = BorderStroke(1.dp, Color.Blue))
    ) {

        Text(
            text = "This card is number",
            fontSize = TextUnit.Companion.Sp(18),
            fontFamily = FontFamily.Cursive,
        )
    }
}
     */
}