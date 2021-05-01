

fun main() {

    fun String.sev() = "mrrrrr" + toUpperCase()

    val evcilHayvan = "kedi"

    println(evcilHayvan.sev())


}


fun String.sev():String {
    return "mrrrrr" + toUpperCase()
}
