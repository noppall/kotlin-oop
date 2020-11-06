package data

abstract class Animal {
    //abstrak function dan abstrak properties sama sifatnya sepertu abstract class, tetapi harus dibuat didalam abstrak class
    abstract fun run(): Unit
    abstract val name: String
}

class cat: Animal(){
    override val name: String = "cat"

    override fun run() {
        println("run $name run!!")
    }

}