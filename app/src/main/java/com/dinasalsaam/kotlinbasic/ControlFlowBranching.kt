package com.dinasalsaam.kotlinbasic

fun main(){
    //PERCABANGAN IF-ELSE

    //Contoh Ke 1
    val tinggiOrangKe1 = 170
    val tinggiOrangKe2 = 189

    //pertanyaan salah
    if (tinggiOrangKe1 > tinggiOrangKe2){
        println("Tinggi orang ke 1 lebih besar dari Tinggi Orang ke 2")
    } else if (tinggiOrangKe1 == tinggiOrangKe2){
        println("Tinggi orang ke 1 sama dengan Tinggi orang Ke 2")
    } else{
        println("Tidak Di Ketahui Tinggi nya")
    }

    //contoh ke 2

    val umur = 31

    if(umur >= 21){
        println("Kamu boleh menikah")
    } else if (umur >= 18){
        println("Kamu harus membuat KTP")
    } else if (umur >= 16){
        println("Kamu boleh mengendarai motor")
    } else{
        println("Kamu masih terlalu kecil untuk melakukan sesuatu")
    }

    //contoh ke 3 (TANPA KURUNG KURAWAL)
    val umur2 = 31

    if (umur2 >= 30)
        println("Kamu lebih dari umur 30")

    //contoh ke 4 (MEMAKAI STRING)
    val nama = "Aka"

    if (nama == "Aka"){
        println("Selamat datang Aka")
    } else{
        println("KAMU SIAPA??")
    }

    //contoh ke 5
    val hujan = true
    if (hujan){
        println("Hari ini hujan")
    }

    //PERCABANGAN WHEN

    //contoh ke 1
    val musim = 5
    when(musim){
        1 -> println("Musim Semi")
        2 -> println("Musim Panas")
        3 -> {
            println("Musim Gugur Fall")
            println("Musim Gugur Autumm")
        }
        4 -> println("Musim Dingin")
        else -> println("Musim Tidak Valid")
    }

    //contoh ke 2
    val bulan = 3
    when (bulan){
        in 3..5 -> println("Musim Semi")
        in 6..8 -> println("Musim Panas")
        in 9..11 -> println("Musim Gugur")
        in 12 downTo 1 -> println("Musim Dingin")
        //pengganti down to
        12,1,2 -> println("Musim Dingin")
        else -> println("Musim Tidak Valid")
    }

    //contoh ke 3
    val umur3 = 21

    when(umur3){
        in 21 .. 150 -> println("Kamu boleh menikah")
        in 18 .. 20 -> println("Kamu harus membuat KTP")
        16,17 -> println("Kamu boleh mengendarai motor")
        else -> println("Kamu masih terlalu kecil untuk melakukan sesuatu")
    }

    //contoh ke 4
    val x : Any = 13.37
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        else -> println("$x Tidak ada di atas")
    }
    val x2 : Any = 13.37f
    when(x2){
        is Int -> println("$x2 is an Int")
        is Double -> println("$x2 is a Double")
        is String -> println("$x2 is a String")
        else -> println("$x2 Tidak ada di atas")
    }
}