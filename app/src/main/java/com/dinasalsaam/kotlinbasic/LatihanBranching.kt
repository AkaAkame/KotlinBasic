package com.dinasalsaam.kotlinbasic

fun main(){

    //rambu lalu lintas
    val lampu = "Hijau"

    if(lampu == "Merah"){
        println("Di mohon untuk berhenti berkendara")
    } else if (lampu == "Kuning"){
        println("Di mohon untuk berhati-hati berkendara")
    } else if (lampu == "Hijau"){
        println("Silahkan teruskan perjalanan")
    }

    //lulus
    val nilai = 70

    if(nilai == 90){
        println("Selamat Anda Lulus")
    } else if (nilai == 70){
        println("Maaf Anda Tidak Lulus")
    }

    //boolean

    //contoh ke 5
    val manis = true
    if (manis){
        println("Makanan ini manis")
    }

    //when
    val hadiah = 4
    when(hadiah){
        1 -> println("Mobil")
        2 -> println("Motor")
        3 -> println("Iphone X")
        4 -> println("Pensil")
        else -> println("Anda tidak menang, sayang sekali :(")
    }

    val handphone = "Iphone X"
    when(handphone){
        "Iphone X" -> println("5.8 (2436x1125) Super AMOLED." +
                "3GB. A11 Bionic SoC 256GB Penyimpanan." +
                "12-MP, f/1.8, OIS Belakang: 2 Cameras." +
                "2716 mAh Pengisian Nirkabel.")
        "Samsung Galaxy Z Flip" -> println("Chipset: Qualcomm SM8150 Snapdragon 855+ (7 nm)" +
                "RAM: 8GB." +
                "Memori internal: 256GB." +
                "Ukuran HP: Unfolded: 167.3 x 73.6 x 7.2 mm." +
                "Folded: 87.4 x 73.6 x 17.3 mm." +
                "Berat HP: 183 gram." +
                "Ukuran layar: 6.7 inci, 1080 x 2636 pixels.")
        "Iphone 7" -> println("Layar : 4.7 in Retina IPS LCD, 750 x 1334 pixels." +
                "RAM : 2 GB." +
                "Memori Internal : 32GB/64GB/128GB." +
                "Kamera Depan : 7 MP, f/2.2." +
                "Kamera Belakang : 12 MP, f/1.8." +
                "Kapasitas Baterai : 1960 mAh.")
        "Samsung Galaxy Note 10" -> println("Sistem operasi Android 9.0 Pie dan antarmuka Samsung One UI." +
                "CPU Qualcomm Snapdragon 855 Plus/Exynos 9825 Octa-core." +
                "Layar 6,3 inci Quad HD+ Curved Dynamic AMOLED HDR10+" +
                "Kamera belakang 16 MP f/2.2 (Ultra Wide), 12 MP f/1.5 dan F/2.4 (Wide), dan 12 MP f/2.1 (Telephoto) OIS." +
                "Kamera depan 10 MP f/2.2." +
                "RAM 8 GB.")
        "Iphone 8 Plus" -> println("Rilis: September 2017." +
                "Chipset: Apple A11 Bionic (10 nm)" +
                "RAM: 3GB." +
                "Memori internal: 64GB/256GB." +
                "Ukuran HP: 158.4 x 78.1 x 7.5 mm." +
                "Berat HP: 202 gram." +
                "Ukuran layar: Retina, 5,5 inci, 1080 x 1920 pixels." +
                "Kamera depan: 7 MP.")
    }

    //jajan
    val uang = 20

    when(uang){
        in 5 ..  10 -> println("Mama Afdan")
        in 20 .. 50 -> println("Chatime")
        in 70 .. 100 -> println("Merchandise")
        else -> println("Aku tidak bisa jajan karna aku miskin :(")

        }

    //bool
    val x : Any = true
    when(x){
        is Int -> println("$x is an Int")
        is Boolean -> println("$x is a Boolean")
        is String -> println("$x is a String")
        else -> println("$x Tidak ada di atas")
    }
}