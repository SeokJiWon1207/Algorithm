package Programming.lambda

// 매개변수에 람다식 함수를 이용한 고차 함수
fun main() {
    var result = highOrder({ x, y -> x + y }, 10, 20)
    println(result)
}

fun highOrder(sum: (Int, Int) -> Int, a:Int, b:Int): Int {
    return sum(a,b)
}