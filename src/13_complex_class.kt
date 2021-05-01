
open class Vehicle(val year: Int)  //if you want to use inheritance, you must mark the class with inheritance

class Bus(year: Int, initialColor : String): Vehicle(year)  {
    var color = initialColor
        get() = field
        set(value: String) {
            if(value != ""){
                field = value
            }
        }
}

fun main() {
    val bus = Bus(2020, "blue")

    println(bus)

    println(bus.year)

    bus.color = "red"

    println(bus.color)
}


