package BaekJoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val list = ArrayList<Int>()
    var testSize = br.readLine().toInt()

    for(i in 1..testSize){
        var (x, y) = br.readLine().split(' ').map { it.toDouble() }
        list.add(planet(x, y))
    }
    for(i in 0..list.size - 1) {
        println(list[i])
    }
}

fun planet(x: Double, y: Double): Int {
    var distance = y - x
    var max = Math.round(Math.sqrt(distance)).toDouble()

    if(distance > Math.pow(max, 2.0)){
        return (max * 2).toInt()
    } else {
        return (max * 2 - 1).toInt()
    }
}