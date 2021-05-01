

fun main() {

    val values = listOf(1, 2, 3)

    values.filter{ i -> i%2 != 0 }
            .map{ i -> i*2 }
            .forEach(::println) // method reference

}
