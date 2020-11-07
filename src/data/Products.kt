package data


//data class merupakan class yang secara otomatis akan membuatkan function equals, hashCode, toString dan copy dari semua properties yang terdapat di primary constructor yang dimmiliki oleh data class
//class yang hanya menampilkan representasi data
data class Products(
    val name: String,
    val price: Int,
    val category: String
)