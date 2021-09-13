package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val dial: IntArray = intArrayOf(3,3,3,4,4,4,5,5,5,6,6,6,7,7,7,8,8,8,8,9,9,9,10,10,10,10)

    println(
            readLine().fold(0) {
                total, next -> dial[next.toInt() - 65] + total
            }
    )
}
