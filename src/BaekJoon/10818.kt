package BaekJoon

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var sc: Scanner = Scanner(System.`in`)
    var size = sc.nextInt()

    var arr = ArrayList<Int>(size)
    for(i in 0 until size){
        val num = sc.nextInt()

        arr.add(num)
    }
    print("${arr.min()} ${arr.max()}")
}
