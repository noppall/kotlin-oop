package data

class Student(val name:String) {
    //function dalam class
    fun panggilNama(namamu: String = name){
        println("Halo ${namamu}")
    }

    //function overloading adalah kemampuan membuat function dengan nama yang sama dalam class
    fun sayHello(username: String){
        println("Aloha $username")
    }
    fun sayHello(firstNameParam: String, lastNameParam: String){
        println("Guten tag $firstNameParam $lastNameParam")
    }
    
}


















































