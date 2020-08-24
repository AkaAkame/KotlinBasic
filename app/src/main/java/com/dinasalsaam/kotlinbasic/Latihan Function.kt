package com.dinasalsaam.kotlinbasic

fun main(){
    myFunction1()

    println(addUp1(5,3))
    println(avg1(5.2, 5.3))
}

fun myFunction1(){
        println("Aku belajar bahasa pemrograman Kotlin")
}

fun addUp1(a : Int, b : Int): Int {
    //output
    return a * b
}

fun avg1(a : Double, b : Double) : Double {
    return (a - b) / 2
}