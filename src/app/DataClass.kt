package app

import data.Products

fun main() {
    val products = Products("telor", 1000, "Sembako")
    println(products)

    //copy dataclass adalah dataclass memiliki function copy yang digunakan untuk menduplikasi objek
    val products2 = products.copy(name = "rambutan", category = "buah")
}

