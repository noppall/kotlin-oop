package app

import data.Minus
import data.Operation
import data.Plus

fun operation(angka1: Int, angka2: Int, operation: Operation): Int {
    return when (operation) {
        is Plus -> angka1 + angka2
        is Minus -> angka1 - angka2
    }
}
