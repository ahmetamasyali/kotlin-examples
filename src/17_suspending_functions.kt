import kotlinx.coroutines.*

suspend fun networkOperation() : String {
    Thread.sleep(3000)
    return "hello"
}

fun main() {
    differentThread()
}

fun differentThread() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }


    var result = async { networkOperation() } // main coroutine continues while a previous one is delayed

    println("Selam ${result.await()}")
}