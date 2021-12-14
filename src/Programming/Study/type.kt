package Programming.Study

fun main(args: Array<String>) {
    val a: Int = 128
    val b = a
    println(a === b) // 자료형이 기본형인 int형이 되어 값이 동일하므로 true

    val c: Int? = a
    val d: Int? = a
    val e: Int? = c
    println(c == d) // 값의 내용만 비교하는 경우 동일하므로 true
    println(c === d) // 값의 내용은 같지만 참조 주소를 비교해 다른 객체(= 주소가다름)이므로 false
    println(c === d) // 값의 내용도 같고 참조된 객체도 동일(= 주소가같음)하므로 true

}