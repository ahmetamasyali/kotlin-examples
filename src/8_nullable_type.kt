
//Int cannot be null
//Int?  nullable

fun ageOfPerson(name: String?): String? { //nullable

    if (name?.length == 0) {
        return null
    }

    if (name == "fırat") {
        return "24"
    }

    return null
}


fun main() {

    println(ageOfPerson(null)?.length ?: 0)  // elvis operator
    println(ageOfPerson("fırat")?.length)



    val kopek = Animal("kopek")
    val human1 = Human("murat", kopek)

    val human2 = Human("mahmut", null)
    var human3 : Human? = null

    println(human1.animal?.name)
    println(human2.animal?.name)
    println(human3?.animal?.name)
}



class Human (val name : String, val animal : Animal?) {

}


class Animal (val name : String) {

}