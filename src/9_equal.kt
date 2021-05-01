

fun main() {

    var person1 = SpecialPerson("ahmet")

    var person2 = SpecialPerson("ahmet", 34)

    var person3 = SpecialPerson(null)

    println("person1 equals person2 : ${person1.name.equals(person2.name)}")

    println("person1 equals person2 : ${person1.name == person2.name}")

    println("person1 equals person3 : ${person1.name == person3.name}")

}


class SpecialPerson(val name: String?, val age: Int = 20) { //default age


}