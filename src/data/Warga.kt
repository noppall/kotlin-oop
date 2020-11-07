package data

class Warga(val name: String, val age: Int)

//extension function
fun Warga.salam(name: String){
    println("halo bapak $name nama saya ${this.name} umur saya ${this.age}")
}

//extension properties
val Warga.namaDusun: String
    get() = this.name.toUpperCase()

