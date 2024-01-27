//fungsi dengan return
fun barang(item : String):Int{
    return when (item){
    	"Gamis" -> 150000
        "Kaos" -> 50000
        "Kemeja" -> 700000
        "Celana" -> 120000
        "Kaos Dalam" -> 20000
        
        else -> 0
    } 
}

fun diskon(harga: Int, diskon: Double): Int{
    return (harga * diskon).toInt()
    
}
fun total(harga: Int, hargaDiskon: Int): Int{
    return (harga - hargaDiskon).toInt()
    
}

fun hitungDiskon(harga: Int): Double {
    return when {
        harga >= 100000 -> 0.1
        harga >= 80000 -> 0.05
        else -> 0.0
    }
}

fun main() {
    val namaBarang = "Gamis"
    val harga = barang(namaBarang)
    val diskon = hitungDiskon(harga)
    val hargaDiskon = if (diskon > 0) diskon(harga, diskon) else 0
    val hargaTotal = total(harga, hargaDiskon)

    println("Baju yang anda beli: \nNama barang\t: $namaBarang \nHarga Barang\t: Rp. $harga")
    println("Diskon \t\t: Rp. $hargaDiskon")
    println("Total Bayar \t: Rp. $hargaTotal")
}

