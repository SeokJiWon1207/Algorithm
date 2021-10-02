package Programming.lambda

// 값에 의한 호출로 람다식 사용하기
fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(boolean: Boolean): Boolean {
    println("값에 의한 호출입니다.")
    return boolean
}

val lambda: () -> Boolean = {
    println("람다식 함수")
    true
}