package BaekJoon

fun main(args: Array<String>) {

    var n = readLine().toString().toInt()
    var count = n
    var asec = 0
    var str:String = ""

    while(count != 0) {

        for(j in 1 .. count-1) {
            str += " "
        }

        for(i in 0 .. asec) {
            str += "*"
        }

        str += "\n"
        count--
        asec++
    }
    println(str)
}