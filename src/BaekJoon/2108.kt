/*
package BaekJoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val sb = StringBuilder()
    val list = mutableListOf<Int>()

    for (i in 0 until n) {
        list.add(br.readLine().toInt())
    }
    br.close()
    list.sort()

    var map = list.groupingBy { it }.eachCount() // Map(Key,Value)
    var arrkey = map.keys.toList()
    var min = 0
    var answer = arrayListOf<Int>()

    for(i in 0..arrkey.size-1) {
        var max = map.values.maxOrNull()
        if (map.getValue(key = arrkey[i]) == max) {
            answer.add(arrkey[i])
        }
    }

    if(answer.size>=2){
        min = answer[1]
    }else if(answer.size < 2){
        min = answer[0]
    }

    sb.append(list.average().roundToInt()).append('\n') // 산술평균
    sb.append(list[n/2]).append('\n') // 중앙값
    sb.append(min).append('\n') // 최빈값
    sb.append(list[n-1] - list[0]) // 범위

    bw.write(sb.toString())
    bw.close()

}*/
