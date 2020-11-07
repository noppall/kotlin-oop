package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val allGenders: Array<Gender> = Gender.values()

    val manFromStrings = Gender.valueOf("MAN")
    val womanFromStrings = Gender.valueOf("WOMAN")

    println(man)
    println(woman)
    println(allGenders)
    man.showDescriptions()
    woman.showDescriptions()
}