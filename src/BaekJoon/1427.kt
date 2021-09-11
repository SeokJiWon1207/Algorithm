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
    var list = arrayListOf<Int>()
    while(n != 0){
        list.add(n % 10)
        n /= 10
    }
    list.sortDescending()
    for(i in list){
        sb.append(i)
    }

    bw.write(sb.toString())
    bw.close()

}