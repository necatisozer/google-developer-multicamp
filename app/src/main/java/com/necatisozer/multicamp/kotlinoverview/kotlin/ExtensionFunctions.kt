package com.necatisozer.multicamp.kotlinoverview.kotlin

fun main() {
    val serkan = Student("Serkan", 25, "Trakya Üniversitesi", "k")
    println(serkan.isMale())
}

fun Person.isMale() = gender == "e"