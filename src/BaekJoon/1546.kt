package BaekJoon

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val size = sc.nextInt()
    val array = DoubleArray(size)
    val M: Int?

    for(i in array.indices){
        array[i] = sc.nextDouble()
    }

    var sum = 0.0
    Arrays.sort(array)

    for (i in 0 until array.size) {
        sum += array.get(i) / array.get(array.size - 1) * 100
    }
    System.out.print(sum / array.size)

}