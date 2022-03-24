package id.ac.polbeng.ziziandrea.test_kelas

//Untuk lebih ringkasnya lagi, deklarasi dan inisialisasi property dapat dilakukan hanya didalam
//parameter konstruktor utama,

class PersonC (var firstName: String, var lastName: String, var age: Int) {}

fun main(){
    val budi = PersonC("Budi", "Gunawan", 21)
    println("Name : ${budi.firstName} ${budi.lastName}")
    println("Age : ${budi.age}")
}
