package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader

fun main(args: Array<String>) {
    var br = BufferedReader(InputStreamReader(System.`in`))
    var input = br.readLine().toInt()

    for (i in (input / 5).downTo(0)) {
        val bag = (input - i * 5)

        if (bag % 3 != 0) {
            continue
        }

        print(i + bag / 3)
        return
    }
    print(-1)


}