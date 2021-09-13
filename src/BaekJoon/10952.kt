package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main(args: Array<String>) = with(BufferedReader(InputStreamReader(System.`in`))) {

    while (true) {
        val st = StringTokenizer(readLine())
        val A = Integer.parseInt(st.nextToken())
        val B = Integer.parseInt(st.nextToken())

        if (A == 0 && B == 0) {
            break
        }

        println("${A + B}")
    }
}