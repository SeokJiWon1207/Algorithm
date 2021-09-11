package BaekJoon

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var sc: Scanner = Scanner(System.`in`)
    var num = sc.nextInt()
    var cycle: Int = 0
    var firstnum = num

    while (true) {
        var a = num / 10
        var b = num % 10

        var temp = (a + b) % 10
        num = b * 10 + temp

        cycle++
        if(firstnum == num) break
    }
    print(cycle)
}