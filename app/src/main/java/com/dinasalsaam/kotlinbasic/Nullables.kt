package com.dinasalsaam.kotlinbasic

fun main(){
    //NULL artinya KOSONG
    //NULL adalah erro yang sering programmer dapatkan yaitu "Null Pointer Exception"
    //NULL di sebut juga The Billion Dollar Mistake

    var name : String = "Aka"
    //name = null -> Compilation Error

    //Memakai tanda tanya
    var nullableName : String? ="Aka"
    //nullableName = null

    var len1 = name.length

    var len2 = nullableName?.length
    println(nullableName?.toLowerCase())
    //Lowe case = huruf kecil semua (tidak ada kapital)

    nullableName?.let { println(it.length)}
}