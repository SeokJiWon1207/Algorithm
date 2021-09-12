package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val croatiaAlphabet = arrayOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var str = readLine()

    croatiaAlphabet.forEach {
        str = str.replace(it, "*")
    }
    println(str.length)
}