package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*


fun main(args: Array<String>) {
    val usrBufferedReader = BufferedReader(InputStreamReader(System.`in`))
    val destination = usrBufferedReader.readLine().toInt()
    var numberOfShell = 1
    var roomNumbers = 1

    if(destination == 1){
        print(1)
    } else {
        while (roomNumbers < destination) { // 1 13
            roomNumbers += (numberOfShell * 6)
            numberOfShell++
        }
        println(numberOfShell)
    }
}
