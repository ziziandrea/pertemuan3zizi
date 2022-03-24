package id.ac.polbeng.ziziandrea.test_kelas


class Greeter {
    var text: String = ""
    fun greet() {
        println("Hello Object world!!")
    }
    fun greet(name: String) {
        println("$text $name")
    }
    fun with_ret_val(name: String): String{
        return "$text $name"
    }
}