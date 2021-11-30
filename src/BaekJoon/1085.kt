package BaekJoon

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val x = scanner.nextInt()
    val y = scanner.nextInt()
    val w = scanner.nextInt()
    val h = scanner.nextInt()

    val list = mutableListOf<Int>()

    list.add(x - 0)
    list.add(y - 0)
    list.add(w - x)
    list.add(h - y)

    print(list.minBy { answer ->
        answer
    })

}