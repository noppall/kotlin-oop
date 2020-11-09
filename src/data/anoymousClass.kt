package data

//anonymous class adalah pembuatan object dari class yang belum lengkap
interface Action {
    fun action()
}

fun fireAction(action: Action){
    action.action()
}

fun main() {
    fireAction(object : Action{
        override fun action() {
            println("action 1")
        }
    })
}