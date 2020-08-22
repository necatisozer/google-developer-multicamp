package com.necatisozer.multicamp.kotlinoverview

fun main() {
    val grade = calculateGrade(75)
    println(grade)
}

fun calculateGrade(note: Int) = when {
    note > 75 -> "A"
    note > 50 -> "B"
    note > 25 -> "C"
    else -> "F"
}
