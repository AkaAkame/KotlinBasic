package com.dinasalsaam.kotlinbasic

fun main(){
    //Tipe Data Angka

    //Tipe data byte = 8 bit = 2 angka
    val myByte : Byte = 13

    //Tipe data short = 16 bit = 5 angka
    val myShort : Short = 12345

    //Tipe data Int/Integer = 32 bit = 10 angka
    val myInt : Int = 12345_12345

    //Tipe data Long = 64 bit = 19 angka
    val myLong : Long = 123_456_7890_123_456_789

    //Tipe Data Angka Titik

    //Tipe data Float = 32 bit
    val myFloat = 12.342F

    //Tipe data Double : 24 bit
    val myDouble : Double = 8.282987823829

    /*
    Ada 2 cara membuat tipe data
    1. Tipe Inference (simple)
    2. Menetapkan tipe data nya
     */

    //Tipe data Boolean, Char, dan String

    //Tipe data boolean
    var isSunny = true
    isSunny = false

    //Tipe data Char
    val letterChar = 'H'
    val digitChar = '1'
    val signChar = '&'

    //Tipe data String
    val myString = "OwO"

    //String
    val myString2 = "UwU"
    val firstCharInString = myString2[0]
    val lastCharInString = myString2[myString2.length - 1]
    println("First Character " + firstCharInString)
    println("Last Character " + lastCharInString)

}