package data

//sealed class dikhususkan untuk inheritance, secara default ia adalah abstrack class
sealed class Operation(val name: String)
class Plus: Operation("add")
class Minus: Operation("minus")

