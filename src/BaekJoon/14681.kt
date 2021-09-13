package BaekJoon

import java.util.*

fun main(args: Array<String>) = with(Scanner(System.`in`)) {

    var x = nextInt()
    var y = nextInt()

    if(x>0){
        if(y>0)
            print(1)
        else if(y<0)
            print(4)
    }else if(x<0){
        if(y>0)
            print(2)
        else if(y<0)
            print(3)
    }

}

