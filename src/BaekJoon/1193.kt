package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {
    val x = readLine().toInt()
    var sum = 0

    for (i in 1 until 10_000_000) {
        if (x in sum + 1..(sum + i)) {
            if (i % 2 == 0) {
                println("${i - (sum + i - x)}/${1 + (sum + i - x)}")
                break
            } else {
                println("${1 + (sum + i - x)}/${i - (sum + i - x)}")
                break
            }
        } else {
            sum += i
        }
    }
}