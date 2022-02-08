package com.example.myapplication

data class Student(
    val name: String,
    val course: Int
    ) {

    override fun toString(): String {
        return "Студент $name учится на $course курсе";
    }
}
