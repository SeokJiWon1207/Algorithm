package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine()!!.toInt()
    var ndb = n.toDouble()
    var sb = StringBuilder()

    for(i in 2..(Math.sqrt(ndb)).toInt()){
        while(n % i == 0){
            sb.append(i).append('\n')
            n /= i
        }
    }
    if(n != 1) {
        sb.append(n)
    }
    println(sb)
}