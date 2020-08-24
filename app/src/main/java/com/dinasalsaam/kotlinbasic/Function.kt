package com.dinasalsaam.kotlinbasic

fun main(){
    myFunction()
    myFunction()

    println(addUp(5,3))
    println(avg(5.2, 5.3))
}

fun myFunction(){
    //Di dalam tanda kurang = buat menaru parameter
    //Di dalam kurung kurawal = buat menambah kode yang dijalankan saat fungsi di panggil
    println("Di panggil dari fungsi")
}

//Contoh ke 2 (Parameter / Input)
fun addUp(a : Int, b : Int): Int{
    //output
    return a+b
}

//Contoh ke 3
fun avg(a : Double, b : Double) : Double{
    return (a+b)/2
}
/*
Inti dari Fungsi, yaitu mempunyai kelebihan-kelebihan :

1. Salah satunya,kita bisa menggunakan kembali kode

2. Contoh nya jika kita bekerja dengan patner, kita mengurus satu bagian kode,
   dan dia mengurus satu bagian kode lain. Kita dapat menggabungkannya dengan
   memiliki fungsi / function yang dapat kita gunakan kembali.

3. Kamu dapat menggunakan fungsi yang sudah di buat sebelumnya dan kamu bisa
   menggunakan atau memanggil fungsinya saja.
 */