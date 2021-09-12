package BaekJoon

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)){

    var h = nextInt()
    var m = nextInt()
    var a = m-45

    if(a < 0){
        h-=1
        a+=60
        if(h<0){
            h+=24
        }
    }
    print("${h} ${a}")

}