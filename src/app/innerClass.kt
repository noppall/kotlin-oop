package app

import data.Boss

fun main() {
    val boss1 = Boss("nopall bos besar")
    val employee1 = boss1.Employee("joki")

    val boss2 = Boss("wisanggeni bos kecil")
    val employee2 = boss2.Employee("pilus")

    employee1.hi()
    employee2.hi()
}

