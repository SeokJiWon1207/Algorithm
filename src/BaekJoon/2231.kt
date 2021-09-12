package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine(), " ")
    val N = st.nextToken().toInt()

    var answer = 0
    for(i in 1..N){
        var temp = linesum(i)
        if(i + temp == N){
            answer = i
            break
        }
    }
    println(answer)
}

fun linesum(n: Int):Int {
    var m = n
    var sum = 0
    while(m > 0){
        sum += m % 10
        m /= 10
    }
    return sum
}
