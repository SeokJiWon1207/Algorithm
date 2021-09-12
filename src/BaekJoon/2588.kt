package BaekJoon

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    var x = nextInt()
    var y = nextInt()

    println(x * (y%10))
    println(x * (y%100/10))
    println(x * (y/100))
    println(x * y)

}