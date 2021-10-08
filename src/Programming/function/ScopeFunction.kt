package Programming.function

fun main() {
    var b = 100

    // apply는 람다함수를 이용해 함수를 실행, 객체를 반환
    var obj = Ex(10, 60).apply {
        a = 30
    }
    println("${obj.a}, ${obj.b}") // 30, 60

    // run 또한 람다를 이용한 수행, apply와는 다르게 기존 람다와 같이 코드의 마지막 줄을 반환
    println(obj.run {
        println("a: ${a}, b: ${b}") // a와 b의 값을 출력하면서
        b // 마지막 b의 값을 반환
    })

    // with은 run과 동일한 기능이지만, run이 객체에 참조연산자를 붙여서 사용하는 반면
    // with은 객체를 parameter로 받아 실행한다는 차이점만 존재
    println(with(obj) { // obj를 객체로 받아 사용
        println("a: ${a}, b: ${b}") // 위와 동일 실행
        b // run과 동일
    })

    println(obj.let { // it이 아닌 다른 이름을 사용하고 싶다면 ex) name -> 와 같이 사용
        println("a: ${it.a}, b: ${it.b}") // 객체인 obj를 it으로 받아 사용
        it.b
    })

    // let함수처럼 내부에서 it사용, apply처럼 객체를 반환
    obj.also {
        it.a = 50
        it.b = 100
        b = 1 // main의 지역변수 b
    }
    println("a: ${obj.a}, b: ${obj.b}, main의 b: $b")

}
class Ex(var a: Int, var b: Int) {

}