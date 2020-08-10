package com.dinasalsaam.kotlinbasic

fun main(){
    //LOOPING (PERULANGAN)

    //PERULANGAN WHILE

    //Perulangan while menjalankan kode berulang kali selama kondisi yang di berikan benar

    //while (kondisi) {
    //  kondisi untuk dijalankan
    // }

    //Contoh ke 1
    var angka1 = 1
    while (angka1 <=  10){
        print("$angka1")
        angka1++
    }
    println("/nPerulangan While Selesai")

    //Contoh ke 2
    var a = 100

    while (a >= 0){
        print("$a")
        a -= 2
    }
    println("Perulangan While Selesai")

    //Contoh ke 3
    var rasaSuhu = "Dingin"
    var suhuRuangan = 16

    while (rasaSuhu == "Dingin"){
        print("$suhuRuangan")
        suhuRuangan++

        if (suhuRuangan == 23){
            rasaSuhu = "Nyaman"
            println("/nSekarang suhunya nyaman")
        }
    }

    //PERULANGAN FOR
    //Perulangan for di gunakan untuk melakukan array

    print("PERULANGAN FOR")

    //Contoh ke 1
    for(number in 1..10){
        print("$number ")
    }

    //Contoh ke 2
    for (i in 1 until 10){
        print("$i ")
    }

    println("___________________")

    //Contoh ke 3
    for(a in 10 downTo 1){
        print("$a ")
    }

    println("___________________")

    //Contoh ke 4
    for(b in 10 downTo 1 step 2){
        print("$b ")
    }

    println("___________________")

    //Contoh ke 5
    val banyakKota = listOf("Jakarta", "Surabaya", "Bandung", "Malang", "Jogja")
    for (kota in banyakKota){
        print("$kota ")
    }
}