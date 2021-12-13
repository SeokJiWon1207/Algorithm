package Programming.Study

fun main(args: Array<String>) {
    var name: String? = "Seok Ji Won"
    name = null
    println("name is ${name?.length}")

    var name2: String? = "Seok Ji Won"
    name2 = null
    println("name2 is ${name2!!.length}")
}