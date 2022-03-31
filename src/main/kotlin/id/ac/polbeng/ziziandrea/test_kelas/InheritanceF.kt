package id.ac.polbeng.ziziandrea.test_kelas

open class EmployeeF {
    open val baseSalary: Double = 10000.0
    open fun displayDetails() {
        println("I am an Employee")
    }
}

class Developer: EmployeeF() {
    override val baseSalary: Double = super.baseSalary + 10000.0
    override fun displayDetails() {
        super.displayDetails()
        println("I am an Developer")
    }
}

fun main() {
    val employeeF = EmployeeF()
    println("${employeeF.javaClass.simpleName} base salary is ${employeeF.baseSalary}")
    println(employeeF.displayDetails())
    val developer = Developer()
    println("${developer.javaClass.simpleName} base salary is ${developer.baseSalary}")
    println(developer.displayDetails())
}

//Ketika kita meng-override property atau fungsi anggota kelas dari kelas induk, maka dari kelas
//anak kita dapat mengakses property atau fungsi anggota dari kelas induknya. Caranya adalah
//dengan menggunakan keyword super(),