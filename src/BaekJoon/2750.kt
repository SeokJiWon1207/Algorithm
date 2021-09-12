package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()

    var arr = IntArray(n,{0})

    for(i in 0 until n){
        arr[i] = readLine().toInt()
    }

    arr.sorted().forEach { println(it) }

}
