package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var (a, b) = br.readLine().split(' ').map { it.toBigDecimal() }
    var c = a.add(b)

    print(c)

}