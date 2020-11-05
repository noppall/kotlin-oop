package app

open class Shape {
    open val jumlahSisi: Int = 0
    open fun macamBentuk(){
        println("aku berbentuk bangun datar")
    }
}

class Segitiga: Shape(){
    //default override properties adalah final, kebalikan dengan override function
    override val jumlahSisi: Int = 3

    //super properties untuk mengakses properties milik class parent
    val punyaParent: Int = super.jumlahSisi

    //super function
    override fun macamBentuk(){
        println("aku berbentuk segitiga")
        super.macamBentuk()
    }

    //super constructor

}