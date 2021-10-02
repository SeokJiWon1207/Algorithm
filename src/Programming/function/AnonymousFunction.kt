package Programming.function

   /*
   일반적인 람다식으로 표기가 가능한데 굳이 익명함수를 쓰는이유?
-> 람다식에서는 return이나 break, continue처럼 제어문을 사용하기 어렵기 때문
   함수 본문 조건식에 따라 함수를 중단하고 반환해야 하는 경우에 익명 함수 사용
   */
fun main() {
    fun(x: Int, y: Int): Int = x + y // 함수 이름이 생략된 익명 함수

    val add: (Int, Int) -> Int = fun(x, y) = x + y
    // = val add = fun(x: Int, y: Int) = x + y
    val result = add(10, 2)

    println(result)
}