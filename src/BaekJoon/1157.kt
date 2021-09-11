package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine()
    val map = mutableMapOf<Char,Int>()
    str.forEach {
        val lowStr = it.toLowerCase()

        if(map.contains(lowStr)){
            map[lowStr] = map[lowStr]!!.plus(1)
        } else {
            map.set(lowStr,1)
        }
    }

    val max = map.maxBy { it.value }

    if(map.filter { it.value == max!!.value }.count() > 1){
        println("?")
    } else {
        println(max!!.key.toUpperCase())
    }


}