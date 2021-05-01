fun main() {

    printHello("ahmet")
    printHello("Ömer", "Selam")


    printHello(name = "Ömer", msg =   "Selam") // ortadaki eleman default olacaksa böyle yapmalıyız
}

fun printHello(name : String, msg: String = "hello") {
    println("$name $msg")
}