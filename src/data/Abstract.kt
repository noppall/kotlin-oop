package data

//abstract class artinya class tersebut tdk bisa dijadikan object, hanya untuk diturunkan
abstract class Location(val name: String)
class CityName(name: String): Location(name)

fun main() {
    val city = CityName("Malang")
}