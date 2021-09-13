package BaekJoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {

    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()

    var arr = IntArray(n)

    for (i in 0 until n) {
        arr[i] = br.readLine().toInt()
    }
    br.close()

    arr.sort()
    for(i in 0 until arr.size) {
        bw.write(arr[i].toString())
        bw.newLine()
    }
    bw.flush()
    bw.close()
}