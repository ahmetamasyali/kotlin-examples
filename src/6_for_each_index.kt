fun main() {

    val  names = listOf("yunus", "hüseyin", "fırat")

    for (name in names) {
        //name = "murat"  //error
        println(name)
    }

    for ((i, name) in names.withIndex()) {
         println("$i $name")
    }
}