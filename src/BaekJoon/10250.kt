package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var input = br.readLine().toInt()
    var list = arrayListOf<String>()
    while(input>0) {
        var (h, w, n) = br.readLine().split(' ').map { it.toInt() }
        list.add(hotel(h, w, n))
        input--
    }
    for(i in 0..list.size-1){
        println(list.get(i))
    }
}


fun hotel(h: Int, w: Int, n: Int) : String {
    var y = if (n % h == 0) h * 100 else (n % h) * 100  // 층구하기
    var x = if (n % h == 0) n / h else (n / h) + 1 // 거리구하기

    var xxyy = x + y
    return xxyy.toString()
}
