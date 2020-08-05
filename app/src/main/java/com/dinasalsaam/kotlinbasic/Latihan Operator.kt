package com.dinasalsaam.kotlinbasic

fun main(){

    val hasilPertambahan = 21 - 1
    println(hasilPertambahan)

    val a = 18
    val b = 1
    val hasilPembagian = a / b
    println(hasilPembagian)

    println("is 5 greater 3 ${10 >= 1}") //true

    println("is -5 greater 3 ${5 == 5}") //true

    println("is 5 lower equal 3 ${12 != 3}") //true

    //Penugasan
    var myNumber = 8
    myNumber *= 4
    myNumber += 5
    println("myNumber is $myNumber")

    var myNumber1 = 9
    myNumber1 *= 12
    myNumber1 += 8
    println("myNumber is $myNumber1")

    var myNumber2 = 1
    myNumber2 *= 1
    myNumber2 += 9
    println("myNumber is $myNumber2")

    println("myNumber is ${++myNumber}")

    println("myNumber is ${--myNumber}")

}
