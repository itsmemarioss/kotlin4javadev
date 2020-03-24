package controlstructures

fun main() {
    //there is ranges
    for ( i in 1..9){
        print(i)
    }

    println()

    //to can be used to create a pair
    val map = mapOf(1 to "one", 2 to "two")
    //for can iterate over maps
    for ((key, value) in map){
        println("$key - $value")
    }

    //until does not include the last value
    for (i in 1 until 9){
        print(i)
    }
}

