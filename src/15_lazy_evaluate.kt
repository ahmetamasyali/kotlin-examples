
fun calculate(n : Int): Int {
    println("calculating...")
    return n*2
}

fun main() {



    val temp by lazy { calculate(30) }

    println("asdasdas")


    if(true) {

        println(temp)
        println(temp)
    }
}