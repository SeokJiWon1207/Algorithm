package BaekJoon

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val input = nextInt()
    for (i in 1..input){
        val a = nextInt()
        val b = nextInt()
        println("Case #${i}: ${a} + ${b} = ${a + b}")
    }
}
