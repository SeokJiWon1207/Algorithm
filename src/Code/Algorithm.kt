package Code

fun main() {
    normalvarag(1,2,3,4)
    normalvarag(4,5,6)
}

fun normalvarag(vararg count: Int) {
    for (num in count){
        print("$num ")
    }

    println("\n")
}










