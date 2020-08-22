package com.necatisozer.multicamp.kotlinoverview

fun main() {
    val serkan = Student("Serkan", 25, "Trakya Üniversitesi", "k")
    println(serkan.isMale())
}

fun Person.isMale() = gender == "e"