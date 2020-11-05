package data

class User(var username: String, var password: String){
    //tidak perlu membuat properties lagi

    //toString function digunakan untuk mengubah object menjadi string
    override fun toString(): String {
        return "user with username = $username"
    }
}