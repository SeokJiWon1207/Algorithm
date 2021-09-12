package BaekJoon

fun main() {
    readLine()
    println(readLine()!!.split(' ').map(String::toInt).filter(::Prime).size)
}

private fun Prime(n: Int) = n != 1 && !(2 until n).any { n % it == 0 }