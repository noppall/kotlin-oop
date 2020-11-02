package app

import data.Person

//properties adalah data yang disisipkan dalam object
fun main() {
    val lanang = Person("Bambang", "", "Wisanggeni")
    println("${lanang.firstName} ${lanang.middleName} ${lanang.lastName}")

    val wadon = Person("Aqilla", "Sarasvati")
    println("${wadon.firstName} ${wadon.lastName}")

}