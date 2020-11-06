package data

//class bisa saja digantikan oleh interface, interface tidak bisa langsung dijadikan object harus diturunkan
interface Interaction {
    //secara default semua properties & function didalam interface adalah abstrack jadi tidak perlu ditambahkan
    val name: String
    fun sayHello(name: String)
}

//inteface juga bisa diinheritkan pada interface lainnya
interface Go: Interaction{
    fun go(){
        println("gooo!!")
    }
}

interface MoveA{
    fun move() = println("move A")
}

interface  MoveB{
    fun move() = println("move B")
}

//pada 1 class child, interface memungkinkan untuk diinheritance sebanyak mungkin
class Human(override val name: String): Go,Interaction,MoveA,MoveB{ //jika diinhertikan maka Interaction tidak wajib ditambahkan
    override fun sayHello(name: String) {
        println(" Hello $name this is  ${this.name}")
    }

    //menghindari conflict saat pemanggilan function yang sama
    override fun move() {
        super<MoveA>.move()
        super<MoveB>.move()
        println("yok bergerak")
    }
}