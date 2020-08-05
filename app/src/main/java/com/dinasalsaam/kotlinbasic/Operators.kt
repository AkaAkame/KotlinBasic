package com.dinasalsaam.kotlinbasic

fun main() {
    /*
    OPERATOR ARITMATIKA
    1. Pertambahan +
    2. Pengurangan -
    3. Perkalian *
    4. Pembagian /
    5. Modulus (Sisa hasil bagi) = %
     */

    //contoh ke1
    val hasilPertambahan = 5 + 3
    println(hasilPertambahan)

    //contoh2
    val hasilModulus = 15 % 2
    println(hasilModulus)

    //contoh 3
    var hasilPerkalian = 5
    hasilPerkalian *= 2
    println(hasilPerkalian)

    //contoh 4
    val a = 20
    val b = 4
    val hasilPembagian = a / b
    println(hasilPembagian)

    //contoh 5 dalam bentuk tipe data
    val c = 5.0
    val d = 3
    val hasil: Double
    hasil = c / d
    println(hasil)

    /*
    OPERATOR PEMBANDING
    1. == Sama dengan
    2. != Tidak sama dengan
    3. < Lebih kecil
    4. > Lebih Besar
    5. <= Kurang dari sama dengan
    6. >= Lebih dari sama dengan
     */

    //Contoh ke 1
    val isEqual = 5 == 3 //salah
    println("isEqual is $isEqual")

    //Contoh ke 2
    val isNotEqual = 5 != 5 //salah
    println("isNotEqual $isNotEqual")

    //STRING INTERPOLATION
    println("is 5 greater 3 ${5 > 3}") //true

    println("is -5 greater 3 ${-5 > 3}") //false

    println("is 5 lower equal 3 ${5 <= 3}") //false

    println("is 5 greater equal 3 ${5 >= 3}") //true

    println("is 5 greater equal 5 ${5 >= 5}") //true

    /*
    PENUGASAN, PENINGKATAN, DAN PENURUNAN OPERATOR
     */

    //PENUGASAN OPERATOR
    // +=, -=, *=, /+, %=

    var myNumber = 5
    myNumber *= 4
    myNumber += 3
    println("myNumber is $myNumber")
    //5 + 3 = *4 = 32

    //PENINGKATAN OPERATOR
    //++ Menambahkan variable sebanyak 1 angka
    println("myNumber is ${++myNumber}")//33

    //PENURUNAN OPERATOR
    // -- Mengurangi variable sebanyak 1 angka
    println("myNumber is ${--myNumber}")//32

}
