package BaekJoon

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    val sc: Scanner = Scanner(System.`in`)
    while (sc.hasNextInt()) {
        val A = sc.nextInt()
        val B = sc.nextInt()

        println("${A + B}")
    }
}