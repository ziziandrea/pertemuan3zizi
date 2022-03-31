package id.ac.polbeng.ziziandrea.test_kelas

interface A {
    fun demo() {
        println("From interface A")
    }
}
interface B {
    fun demo() {
        println("From interface B")
    }
}
// This class implements X and Y interfaces
class MyClassB: A, B {
    override fun demo() {
        super<A>.demo()
        super<B>.demo()
    }
}
fun main() {
    val obj = MyClassB()
    obj.demo()
}

//Ketika multiple interface memiliki method yang sama maka untuk memecahkan masalah
//tersebut pada kelas yang mengimplementasikan interface tersebut ditambah keyword super.
