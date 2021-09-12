package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var testsize = br.readLine().toInt()
    var list = arrayListOf<Int>()
    while(testsize>0) {
        var n = br.readLine().toInt()
        var k = br.readLine().toInt()
        list.add(chairman(n, k))
        testsize--
    }
    for(i in 0..list.size-1){
        println(list.get(i))
    }

}


fun chairman(n: Int, k: Int) : Int {
    var apt = Array(15, {Array(15,{0}) }) // 15x15

    for(i in 0..14){
        apt[i][1] = 1 // i층 1호
        apt[0][i] = i // 0층 i호
    }

    for(i in 1..14){ // 1층부터 14층
        for(j in 2..14){ // 2층부터 14호
            apt[i][j] = apt[i][j-1] + apt[i-1][j]
        }
    }
    return apt[n][k]
}