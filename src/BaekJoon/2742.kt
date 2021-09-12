package BaekJoon

fun main(args: Array<String>) {

    var sc: String? = readLine()
    var input: String = sc.toString()

    var value:Int = input.toInt();

    for(i in value downTo 1){
        println("${i}")
    }

}
