package BaekJoon

fun main(args: Array<String>) {

    var sc: String? = readLine()
    var input: String = sc.toString()
    var n: Int = input.toInt()

    if (!(n >= 1 && n <= 10000)) {
        println("범위초과 에러")
        return
    }

    var output = n * (n + 1) / 2

    println(output)
}