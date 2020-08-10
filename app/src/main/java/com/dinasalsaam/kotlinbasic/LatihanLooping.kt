package com.dinasalsaam.kotlinbasic

fun main(){
    var angka1 = 15
    while (angka1 <=  50){
        print("$angka1 ")
        angka1++
    }
    println("\nPerulangan While Selesai")

    var angka2 = 20
    while (angka2 <=  25){
        print("$angka2 ")
        angka2++
    }
    println("\nPerulangan While Selesai")

    var a = 25

    while (a >= 10){
        print("$a ")
        a -= 2
    }
    println("\nPerulangan While Selesai")

    for(b in 50 until 100 step 2) {
        print("$b ")
    }

    println("\nPerulangan While Selesai")

    for (i in 90 until 150) {
        print("$i ")
    }
    println("Selesai")

    val jumlahChara = listOf("Aka", "Zetsubo-o", "Black", "Rainy", "Leo")
    for (char in jumlahChara) {
        print("$char ")
    }
}