package BaekJoon

import java.util.*


fun main(args: Array<String>) = with(Scanner(System.`in`)) {
    var str = readLine().toString() // 10 5
    var arrstr = str.split(" ")
    var answer: String = ""

    var a: Int = arrstr.get(0).toInt() // 10
    var b: Int = arrstr.get(1).toInt() // 5

    str = readLine().toString() // 1 2 3 4 5 6 7 8 9 10
    arrstr = str.split(" ")

    for(i in 0 .. a-1){
        var value = arrstr[i].toInt()
        if(value < b)
            answer += value.toString() + " "
    }
    print(answer)
}