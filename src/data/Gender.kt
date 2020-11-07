package data

//enum class merupakan class yang sudah tetap nilainya
enum class Gender(val descriptions: String) {
    MALE("Male"),
    FEMALE("Female");

    fun showDescriptions() {
        println(descriptions)
    }
}