package BaekJoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.lang.StringBuilder

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    var n = br.readLine().toInt()

    var list = arrayListOf<Pair<Int,String>>()

    repeat(n){
        var (a,b) = br.readLine().split(' ')
        list.add(Pair(a.toInt(),b))
    }

    var sortlist = list.sortedWith(compareBy() { it.first })

    for(i in 0 until n){
        sb.append(sortlist[i].first).append(' ').append(sortlist[i].second).append('\n')
    }

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}