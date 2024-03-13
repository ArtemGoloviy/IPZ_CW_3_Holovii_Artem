package ua.edu.lntu.cw_3

class Item(val day: Int, val title: String = "Day $day", description: String = "This is description $day.") {

    val randomImageRes = listOf(
        R.drawable.image1,
        R.drawable.image2,
    ).random()

}