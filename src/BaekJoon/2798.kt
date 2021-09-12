package BaekJoon

import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var st = StringTokenizer(readLine(), " ")
    val N = st.nextToken().toInt()
    val M = st.nextToken().toInt()

    val arr = IntArray(N)
    var result = 0

    st = StringTokenizer(readLine(), " ")
    for (i in 0 until N) {
        arr[i] = st.nextToken().toInt()
    }

    for (i in 0 until N - 2) {
        if (arr[i] > M) continue

        for (j in i + 1 until N - 1) {
            if (arr[i] + arr[j] > M) continue

            for (k in j + 1 until N) {
                val temp = arr[i] + arr[j] + arr[k]
                if (M == temp) {
                    result = temp
                }
                if (temp in (result + 1) until M) {
                    result = temp
                }
            }
        }
    }
    print(result)

}