package BaekJoon

import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val array = IntArray(10)
    var result = a * b * c

    while (result != 0) {
        array[result % 10]++
        result /= 10
    }

    for (i in array.indices) {
        println(array[i])
    }
}
