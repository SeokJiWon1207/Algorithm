package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    // var (a, b) = br.readLine().split(' ').map { it.toInt() }
    var a = br.readLine()!!.toInt()
    var b = br.readLine()!!.toInt()

    var list = mutableListOf<Int>()

    for (i in a..b) {
        if (Prime(i) == true) {
            list.add(i)
        }
    }

    if (list.isEmpty() == true) {
        print(-1)
    } else {
        println(list.sum())
        println(list[0])
    }
}

private fun Prime(n: Int) = n != 1 && !(2 until n).any { n % it == 0 }