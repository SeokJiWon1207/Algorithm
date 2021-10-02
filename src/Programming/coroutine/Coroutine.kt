package Programming.coroutine

import kotlinx.coroutines.Deferred
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking {
    /*
    // async
    val time = measureTimeMillis {
        val name: Deferred<String> = async { getFirstName() }
        val lastName: Deferred<String> = async { getLastName() }
        println("Coroutine, ${name.await()} ${lastName.await()}")
    }
    println("measure Time : $time")
    */

    /*
    // runBlocking
    val time = measureTimeMillis {
    val name = getFirstName()
    val lastName = getLastName()
    println("Coroutine, $name $lastName")
    }
    println("measure Time : $time")
    */

}

suspend fun getFirstName(): String {
    delay(1000)
    return "석"
}

suspend fun getLastName(): String {
    delay(1000)
    return "지원"
}

