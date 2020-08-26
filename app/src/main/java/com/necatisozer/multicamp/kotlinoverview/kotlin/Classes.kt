package com.necatisozer.multicamp.kotlinoverview.kotlin

fun main() {
    val necati: Person = Person("Necati", 25, "e")
    val necati2: Person = Person("Necati", 25, "e")

    // println(necati === necati2)

    //println("name: ${person.name}")
    //println("age: ${person.age}")

    val serkan = Student("Serkan", 25, "Trakya Üniversitesi", "e")
    println(serkan.isUnderAge())
}

