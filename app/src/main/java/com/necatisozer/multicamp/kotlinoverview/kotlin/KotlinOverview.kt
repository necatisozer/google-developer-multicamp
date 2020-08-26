package com.necatisozer.multicamp.kotlinoverview.kotlin

fun main() {
    // println("Hello World!")

    val number: Int = 10
    val numberLong: Long = 10
    val bool: Boolean = true
    val str: String = "Hello!"
    var dbl: Double = 3.14

    dbl = 4.48

    val name = "Serkan"
    val age = 20
    val printValue = """
        |Hello $name
        |$age yaşındasın"""
    // println(printValue)

    val grade = 30
    val note: String = when {
        grade > 75 -> "A"
        grade > 50 -> "B"
        grade > 25 -> "C"
        else -> "F"
    }

    print("Notunuz: $note")

}