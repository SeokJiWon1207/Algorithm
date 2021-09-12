package BaekJoon

import java.util.*

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()

    for(i in 1..9){
        println("${a} * ${i} = ${a*i}")
    }

}


