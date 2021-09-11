package Code


import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*
import kotlin.collections.ArrayList


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val sb = StringBuilder()
    var n = br.readLine().toInt()

    val (a,b) = br.readLine().split(' ').map { it.toInt() }

    

    bw.write(sb.toString())
    bw.flush()
    bw.close()
}





