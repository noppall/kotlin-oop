package data

//inner class adalah class didalam class
class Boss(val bossName: String){
    inner class Employee(val name: String){
        fun hi(): Unit {
            println("halo pak bos ${this@Boss.bossName}, saya $name")
        }
    }
}