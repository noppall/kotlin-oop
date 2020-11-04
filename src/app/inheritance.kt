package app

open class Employee(val name: String){
    open fun sapa(name: String){
        println("halo pak $name, selamat datang nama saya ${this.name}")
    }
}

class Manager(name: String): Employee(name){
    //override ini sifatnya open, jadi bisa di override lagi
    override fun sapa(name: String) {
        println("selamat pagi pak $name, saya ${this.name}")
    }
}

final class VicePresident(name: String): Employee(name)