package app

import data.Note
import data.bigNote

fun main() {
    val note = Note("Belajar Memasak")
    println(note.title)

    note.title = "ganti"
    println(note.title)

    val bignote = bigNote("Belajar Kotlin")
    println(bignote.bigtitle)
}