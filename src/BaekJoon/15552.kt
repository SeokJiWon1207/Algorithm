package BaekJoon

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.*

fun main(args : Array<String>){
    val BR = BufferedReader(InputStreamReader(System.`in`))
    val BW = BufferedWriter(OutputStreamWriter(System.out))

    val caseSize: Int = Integer.parseInt(BR.readLine())
    for (testCase in 0..(caseSize-1)) {
        val st = StringTokenizer(BR.readLine())
        var num1 = Integer.parseInt(st.nextToken())
        var num2 = Integer.parseInt(st.nextToken())
        var result = num1 + num2
        BW.write(result.toString())
        BW.write("\n")
    }

    BW.flush()
    BW.close()
}











