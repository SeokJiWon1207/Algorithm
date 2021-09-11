package BaekJoon

import kotlin.collections.HashSet

fun main(args: Array<String>) {
    var cnt = readLine()!!.toInt()
    repeat(cnt){
        readLine()!!.run {
            var set = HashSet<Char>()
            forEachIndexed { index, c ->
                if(!set.contains(c)) //
                    set.add(c) // a
                else if (get(index - 1) != c) {
                    cnt--
                    return@run
                }
            }
        }
    }
    print(cnt)
}