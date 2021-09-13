package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))){
    var testsize = readLine().toInt()
    for (i in 0..testsize-1){
        var n = readLine().toInt()

        var a = n / 2
        var b = n - a

        while (true){
            if (isPrime(a) && isPrime(b)){
                break
            } else {
                a--
                b++
            }
        }
        println("$a"+" "+"$b")
    }
}

fun isPrime(n: Int): Boolean{
    var check = true
    var ndb = n.toDouble()
    for(i in 2..(Math.sqrt(ndb).toInt())){
        if(n % i == 0)
            check = false
    }
    return check // 소수면 true 리턴
}