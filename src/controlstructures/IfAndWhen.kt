package controlstructures

import commons.*

fun main() {
    //if statements return a value
    val result = if(12>12) "a" else "b";
    println(result)
    whenAsInstanceOf(Dog())
    whenWithEnum(Color.BLUE)
}

fun whenAsInstanceOf(pet : Pet){

    when(pet){
        //no need to cast values here
        is Dog -> pet.woof()
        is Cat -> pet.meow()
    }
}

fun whenWithEnum(color : Color){
    when(color){
        //no need to use break to stop execution
        Color.BLACK -> println("Black")
        Color.BLUE -> println("Blue")
        else -> println("no color")
    }
}