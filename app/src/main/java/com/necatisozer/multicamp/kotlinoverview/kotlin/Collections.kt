package com.necatisozer.multicamp.kotlinoverview.kotlin

fun main() {
    val set= mutableSetOf(1, 2, 3, 1, 5, 9)
    // println(set)
    // println(set.size)

    // val list: List<String> = listOf("A", "B", "F", "X", "A", "F")
    // println(list[3])

    val map = mutableMapOf(
        "araba" to "Arabanın tanımı",
        "kuş" to "Kuşun tanımı"
    )
    // println(map["kuş"])

    val list = mutableListOf("A", "B", "F", "X", "A", "F")
    list[0] = "S"
    println(list)

}