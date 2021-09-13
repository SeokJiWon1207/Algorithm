package BaekJoon

import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val num = nextInt()

    repeat(num) {
        val ox = next()
        var count = 1
        var result = 0
        ox.forEach {
            if (it == 'O') {
                result += count++
            } else {
                count = 1
            }
        }

        println(result)
    }
}