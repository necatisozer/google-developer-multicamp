package com.necatisozer.multicamp.kotlinoverview

fun main() {
    var student: Student? = null

    if (false) {
        student = Student("Serkan", 25, "Trakya Üniversitesi", "k")
    }

    val name = student?.name ?: "isim bulunmadı"


    println(name.length)
}