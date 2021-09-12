package BaekJoon

fun main(args: Array<String>) {
    var (x1,y1) = readLine()!!.split(' ').map { it.toInt() }
    var (x2,y2) = readLine()!!.split(' ').map { it.toInt() }
    var (x3,y3) = readLine()!!.split(' ').map { it.toInt() }

    var x = x1
    var y = y1

    if(x1==x2) x=x3
    if(x1==x3) x=x2
    if(y1==y2) y=y3
    if(y1==y3) y=y2

    println("$x $y");
}