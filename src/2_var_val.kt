fun main() {
    val ageOfAhmet : Int = 34 // optional

    //ageOfAhmet++  //error
    println(ageOfAhmet)

    var ageOfHarun = 23

    //ageOfHarun = "asdas"  //error

    ageOfHarun++
    println(ageOfHarun)

    val name = "ahmet"
    println("Hello $name ${name.length}")
}

// val vs var
//final = val
// variable name first
//use val most of the time