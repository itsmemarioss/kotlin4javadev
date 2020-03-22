@file:JvmName("Util")
package intro

fun main(args : Array<String>){
    val name = if(args.size > 0) args[0] else "Mario"
    println("Hello, $name!")
}

fun lists(){
    val modifiableList = mutableListOf("asdf")
    modifiableList.add("qwer")
    val unmodifiableList = listOf("kotlin")

    //unmodifiableList.add("")

}