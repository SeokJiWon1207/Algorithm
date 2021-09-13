package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader


fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()
    println(factorial(n))

}
fun factorial(n: Int): Int = if(n!=0) n * factorial(n - 1) else 1