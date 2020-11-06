package data

//getter dan setter, getter adalah function untuk mengambil data properties & setter untuk mengubah data properties
class Note(title: String) {
    var title: String = title
        get() {
            println("call getter")
            return field
        }
        set(value) {
            if(field.isNotBlank()){
                field = value
            }
        }
}

class bigNote(val title: String){
    val bigtitle: String
        get() = title.toUpperCase()
}