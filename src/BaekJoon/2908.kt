package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (a: String, b: String) = readLine()
            .split(" ")
            .map { it.reversed() }

    println(
            if (a > b) a
            else b
    )
}