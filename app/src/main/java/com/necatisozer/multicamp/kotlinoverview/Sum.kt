package com.necatisozer.multicamp.kotlinoverview

fun main() {
    val toplam = topla(3.1, 6.2, 0.1, 4.4)
    // println(toplam)
}

fun topla(vararg sayilar: Double) {
    sayilar.forEach {
        println(it)
    }
}