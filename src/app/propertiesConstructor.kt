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

    //equals atau perbandingan (== dan !=)
    val comp1 = User("kapiten", "pedangPanjang15")
    val comp2 = User("kapiten", "pedangPanjang15")

    println(comp1 == comp2) //jika dibandingan objectnya maka akan false
    println(comp2 == comp2)
    println(comp1 != comp1)
}