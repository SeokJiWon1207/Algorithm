package BaekJoon

import kotlin.math.hypot

fun main(args: Array<String>) {
    var sb = StringBuilder()
    while(true){
        var (x, y, z) = readLine()!!.split(' ').map { it.toInt() }
        if(x == 0 && y == 0 && z == 0) break
        var a = x.toDouble()
        var b = y.toDouble()
        var c = z.toDouble()
        if(hypot(a,b)==c) sb.append("right").append('\n')
        else if(hypot(b,c) == a) sb.append("right").append('\n')
        else if(hypot(c,a) == b) sb.append("right").append('\n')
        else sb.append("wrong").append('\n')
    }
    println(sb)
}