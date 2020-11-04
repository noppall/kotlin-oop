package app

import data.Student

fun main() {
    val sis1 = Student("robi")
    sis1.panggilNama()
    val sis2 = Student("polo")
    sis2.sayHello("polo", "samuel")

    val sis3 = Student("Louis")
    sis3.disBonjour("Samuel", "Vouiton")
}