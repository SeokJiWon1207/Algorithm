package Programming.lambda

fun main() {
    val result = callByValue2(lambda2())
    println(result)
}

fun callByValue2(boolean: Boolean): Boolean { // 일반 변수 자료형으로 선언된 매개변수
    println("값에 의한 호출")
    return boolean
}

val lambda2: () -> Boolean = {
    println("lambda Function")
    true
}