package id.ac.polbeng.ziziandrea.test_kelas

fun main() {
    val meri = Student("Meri", 20)
    // Destructuring Declaration
    val(name, age) = meri
    println("Name = $name")
    println("Age = $age")
}


//Kita dapat mendestruksi data kelas sebuah objek kedalam sejumlah variabel menggunakan
//destructing declarations.