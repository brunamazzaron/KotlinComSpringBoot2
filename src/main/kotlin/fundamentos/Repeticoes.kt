package fundamentos

fun main(){
    printar1a10()
    println("--------------------")
    printar10a1()

}

fun printar1a10(){
    for(numero in 1 .. 10){
        println(numero)
    }
}

fun printar10a1(){
    for(numero in 10 downTo 1){
        println(numero)
    }
}