package controlstructures

fun main() {
    val result = if(12>12) "a" else "b";
    println(result)
    whenAsInstanceOf(Dog())
    whenWithEnum(Color.BLUE)
}

fun whenAsInstanceOf(pet : Pet){
    when(pet){
        is Dog -> pet.woof()
        is Cat -> pet.meow()
    }
}

fun whenWithEnum(color : Color){
    when(color){
        Color.BLACK -> println("Black")
        Color.BLUE -> println("Blue")
        Color.YELLOW -> println("Yellow")
    }
}