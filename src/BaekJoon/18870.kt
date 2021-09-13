package BaekJoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    var n = br.readLine().toInt()

    val input = br.readLine().split(" ".toRegex()).toTypedArray()
    val arr = IntArray(n)
    for (i in 0 until n) arr[i] = input[i].toInt()
    var count = 0
    var map = mutableMapOf<Int,Int>()
    var arrclone = arr.clone()
    Arrays.sort(arrclone)

    for(i in 0 until n){
        if(!map.containsKey(arrclone[i])){
            map.put(arrclone[i], count++)
        }
    }

    for(i in 0 until n){
        sb.append(map.get(arr[i])).append(' ')
    }
    bw.write(sb.toString())
    bw.flush()
    bw.close()
}
