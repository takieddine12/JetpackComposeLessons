package com.example.testingcomposedelete.objects

class ComposeNavigationBar {

    /*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Scaffold(
                topBar = { ProvideTopAppBar(context = this, title = "Bottom Navigation Compose") },
                bodyContent = {},
                bottomBar = {
                    var list = listOf("Home", "Sport", "News", "Food")
                    var listIcons = listOf(
                        Icons.Default.Mail,
                        Icons.Default.Home,
                        Icons.Default.Folder
                    )

                    BottomNavigation {
                        list.forEach { label ->
                            listIcons.forEach { icon ->
                                BottomNavigationItem(
                                    onClick = { Toast.makeText(this@MainActivity,"Current Item $label",Toast.LENGTH_LONG).show() },
                                    icon = { Icon(icon) },
                                    label = { Text(text = label) },
                                    selected = false
                                )
                            }
                        }

                    }
                }
            )

@Composable
fun ProvideTopAppBar(context: Context, title: String) {
    TopAppBar(
        actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Click Waves Button...", Toast.LENGTH_LONG).show()
            }) {
                Icon(Icons.Default.Menu)
            }
        },
        title = { Text(text = title, color = Color.Red) },
        backgroundColor = Color.White,
        elevation = 12.dp,
    )
}

     */
}