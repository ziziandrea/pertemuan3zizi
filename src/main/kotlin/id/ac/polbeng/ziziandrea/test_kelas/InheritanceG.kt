package id.ac.polbeng.ziziandrea.test_kelas

open class Base(val  name: String) {
    init {
        println("Initializing Base")
    }
    open val size: Int = name.length.also {
        println("Initializing size in Base: $it")
    }
}

class Derived(name: String, val lastName: String) :
        Base(name.capitalize().also { println("Argument for Base: $it") }) {
            init {
                println("Initializing Derived")
            }
            override val size: Int = (super.size + lastName.length).also {
                println("Initializing size in derived: $it")
            }
        }

fun main() {
    val turunan = Derived("Zizi", "Andrea")
    turunan.size
}

//Selama pembuatan sebuah instance baru dari kelas turunan, inisialisasi kelas induk diselesaikan
//terlebih dahulu pada langkah pertama (hanya mendahulukan evaluasi dari argument untuk
//konstruktor kelas induk) dan demikian terjadi sebelum inisialisasi logika dari kelas turunan yang
//berjalan