package BaekJoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder
import java.util.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    var n = br.readLine().toInt()

    var arr = Array(n, {Array(2,{0})})

    for (i in 0 until n) {
        var (a, b) = br.readLine().split(' ').map { it.toInt() }
        arr[i][0] = a
        arr[i][1] = b
    }


    Arrays.sort(arr, object : Comparator<Array<Int>> {
        override fun compare(e1: Array<Int>, e2: Array<Int>): Int {
            if (e1[1].equals(e2[1])) {
                return e1[0] - e2[0]
            } else {
                return e1[1] - e2[1]
            }
        }
    })

    for (i in 0 until n) {
        sb.append(arr[i][0]).append(' ').append(arr[i][1]).append('\n')
    }

    bw.write(sb.toString())
    bw.close()


}