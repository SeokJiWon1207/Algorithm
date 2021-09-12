package BaekJoon

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var sc: Scanner = Scanner(System.`in`)

    var arr = ArrayList<Int>(9)
    for(i in 0 .. 8){
        val num = sc.nextInt()
        arr.add(num)
    }
    var max = arr.max()
    var point = arr.indexOf(max)
    println("${arr.max()}")
    println("${point+1}")
}