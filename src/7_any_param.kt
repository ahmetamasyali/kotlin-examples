fun process(input: Any): String {

    return when(input) {
        1 -> "bir"
        in 20..30 -> "20 30 arası"
        is String -> "bu bir string ${input.length} karakter"  //smart casting
        else -> ":("
    }
}

fun process2(input: Any) = when(input) {
    1 -> "bir"
    in 20..30 -> "20 30 arası"
    is String -> "bu bir string ${input.length} karakter"  //smart casting
    else -> ":("
}

fun main() {

    println(process2(1))

    println(process2("murat"))

    println(process2(23))

    println(process2(1.2))
}