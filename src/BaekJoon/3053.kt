package BaekJoon

import kotlin.math.*

fun main(args: Array<String>) {
    var r = readLine()!!.toDouble()
    var pi = Math.PI
    println(round(r * r * pi * 10_000_000) / 10_000_000)
    println(round( r * r * 2 * 10_000_000) / 10_000_000)

}