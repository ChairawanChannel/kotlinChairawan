//Muhamamd Chairawan
//A

fun pesan(nama:String){
    println ("Hai $nama, Selamat mengerjakan ujian")
}

fun luasSegitiga(alas:Int, tinggi:Int): Double {
    return 0.5 * alas * tinggi
}
fun luasPersegi(sisi: Int): Int {
    return sisi * sisi
}
fun kelilingBalok(panjang: Int, lebar: Int, tinggi: Int): Int {
    return 4 * (panjang * lebar tinggi)
}
fun kelilingLingkaran(r: Int): Double{
    return 2 * 3.14 * r * r
}
fun main(){
    pesan("Awan")
    val hasilSegitiga = luasSegitiga (2,5)
    println("Hasil rumus menghitung Luas Segitiga: $hasilSegitiga")
    
    val hasilPersegi = luasPersegi (5)
    println("Hasil rumus menghitung Luas Persegi: $hasilPersegi")
    
    val hasilBalok = kelilingBalok (2, 3, 4)
    println("Hasil rumus menghitung Keliling Balok: $hasilBalok")
    
    val hasilLingkaran = kelilingLingkaran (10)
    println("Hasil rumus menghitung Keliling: $hasilLingkaran")
}