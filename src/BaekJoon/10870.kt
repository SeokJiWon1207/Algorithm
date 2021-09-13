package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader


fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var num = br.readLine().toInt()
    println(fibonacci(num))

}
fun fibonacci(n: Int): Int = when(n) {
    0 -> 0
    1 -> 1
    else -> fibonacci(n - 1) + fibonacci(n - 2)
}