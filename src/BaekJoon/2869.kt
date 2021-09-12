package BaekJoon

package Code

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var (up, down, total) = br.readLine().split(' ').map { it.toInt() }

    var dif = up - down // 올라가는 거리
    var rem = total - up // 남은 거리
    var day = rem / dif
    if(rem % dif == 0){
        print(day+1)
    }else{
        print(day+2)
    }


}








