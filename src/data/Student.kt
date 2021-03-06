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

    //this adalah keyword yang bisa digunakan untuk mereferensikan objek saat ini, hanya digunakan pada kelas itu saja
    fun disBonjour(prenom:String, nomDeFamille: String){
        println("bonjour $prenom $nomDeFamille bienvenue, my name is ${this.name}")
    }
}


















































