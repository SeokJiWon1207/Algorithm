package Programming.function

/*
인라인 함수는 이 함수가 호출되는 곳에 함수 본문의 내용을 모두 복사해 넣어
함수의 분기 없이 처리되기 때문에 코드의 성능을 높일 수 있다.
*/
fun main() {
    shortFunction(3){ println("첫번째 호출 : $it")}
    shortFunction(5){ println("두번째 호출 : $it")}
}

inline fun shortFunction(a:Int, out: (Int) -> Unit) {
    println("호출 전")
    out(a)
    println("호출 후")
}

/*
결과
-------------
호출 전
첫번째 호출 : 3
호출 후
호출 전
두번째 호출 : 5
호출 후

코드상에서는 shortFunction() 함수가 2번 호출되는 것처럼 보이지만 역컴파일 해보면
shortFunction()의 함수가 두번이 복사 된것을 알 수 있다.
*/
