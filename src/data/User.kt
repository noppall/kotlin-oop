package data

class User(var username: String, var password: String){
    //tidak perlu membuat properties lagi

    //toString function digunakan untuk mengubah object menjadi string
    override fun toString(): String {
        return "user with username = $username"
    }

    //ini akan membandingkan nilai objek bukan objeknya
    override fun equals(other: Any?): Boolean {
        return when(other){
            is User -> other.username == this.username
            else ->  false
        }

    }
}