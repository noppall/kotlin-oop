package app

import data.User

fun main() {
    val nopal = User("noppall", "adadeh12")

    nopal.username = "bukannopal"

    //properties langsung dari constructor
    println(nopal.username)
    println(nopal.password)

    val yusak = User("yousuck", "yeeysick15")

    println(yusak)  //tidak perlu dengan toString
}