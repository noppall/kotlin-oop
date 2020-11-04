package app

open class Shape {
    open val jumlahSisi: Int = 0
}

class Segitiga: Shape(){
    //default override properties adalah final, kebalikan dengan override function
    override val jumlahSisi: Int = 3

    //super properties untuk mengakses properties milik class parent
    val punyaParent: Int = super.jumlahSisi
}