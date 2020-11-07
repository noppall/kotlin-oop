package app

import data.Warga
import data.namaDusun
import data.salam

fun main() {
    val bapak1 = Warga("Jiloy", 40)
    bapak1.salam("robert")
    println(bapak1.namaDusun)
}
