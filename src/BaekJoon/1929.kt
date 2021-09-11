package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var (a, b) = br.readLine().split(' ').map { it.toInt() }

    val notprime = BooleanArray(b + 1)
    notprime[1] = true
    for(i in 2..b){
        if(notprime[i]) continue
        var j = i * 2
        while (j <= b){
            notprime[j] = true
            j += i
        }
    }
    for(i in a..b) if(!notprime[i]) println(i)
}