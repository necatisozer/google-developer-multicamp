package com.necatisozer.multicamp.kotlinoverview

open class Person(open val name: String, open val age: Int, open val gender: String)

data class Student(
    override val name: String,
    override val age: Int,
    val school: String,
    override val gender: String
) : Person(name, age, gender) {

    fun isUnderAge() = age < 18

}