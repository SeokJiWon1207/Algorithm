package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    var n = br.readLine().toInt()

    var set = mutableSetOf<String>()

    repeat(n){
        set.add(br.readLine())
    }
    val list = set.sortedWith(kotlin.Comparator<String>{ a, b ->
        if(a.length > b.length) 1
        else if(a.length < b.length) -1
        else a.compareTo(b)

    })

    list.forEach { println(it) }


}