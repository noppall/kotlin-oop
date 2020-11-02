package data

//constructor adalah function yang pertama kali dipanggil
class Person(firstNameParam: String, middleNameParam: String?, lastNameParam: String ) {
    //initializer block adalah block kode yang akan dieksekusi ketika constructor dipanggil
    init {
        println("Hai sayang")
    }


    //secondary constructor adalah pembuatan constructor yang lebih dari satu, juga bisa digunakan ketika tidak ingin mewajibkan constructor utama
    constructor(firstNameParam: String, lastNameParam: String) :
        this(firstNameParam, null, lastNameParam){
        println("secondary constructor bisa lebih dari 1")
    }


    //properties
    var firstName = firstNameParam
    var middleName = middleNameParam
    var lastName = lastNameParam


}