package Programming.Study

fun main(args: Array<String>) {
    /*var name: String? = "Seok Ji Won"
    name = null
    println("name is ${name?.length}")

    var name2: String? = "Seok Ji Won"
    name2 = null
    println("name2 is ${name2!!.length}")*/

    var name3: String? = "Ji Won"
    name3 = null

    val len = if (name3 != null) name3.length else -1
    println("name3 : $name3, len : $len")

    var name4: String? = "Kotlin"
    name4 = null
    println("name4 : $name4, length : ${ name4?.length ?: -1 }")
}