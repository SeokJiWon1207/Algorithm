package BaekJoon

import java.util.*


fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)

    val array = IntArray(10)


    for(i in array.indices){
        array[i] = sc.nextInt() % 42
    }

    equal(array)

}

fun equal(array: IntArray) {
    var answer = 0

    for(i in array.indices){
        var count = 0
        for(j in i+1 until array.size){
            if(array[i] == array[j])
                count++
        }
        if(count == 0)
            answer++
    }

    println(answer)
}