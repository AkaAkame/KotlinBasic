package com.dinasalsaam.kotlinbasic

fun main(){
    var nameNullable : String? = "Aka"
    nameNullable = null

    //val nama = nameNullable ?: "Black"
    //println("Name is $nama")

    //NOT NULL ASSERTION = !!
    //Fungsi nya mengubah tipe nullable ke tipe non-nullable, dan membuat
    //error "null pointer exception" jika tipe nullable tidak memiliki nilai

    println(nameNullable!!.toLowerCase())
}