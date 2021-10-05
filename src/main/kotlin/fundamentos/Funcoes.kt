package fundamentos

//usar unit é a mesma coisa que nao usar nada
fun main(): Unit{
    dizOi(retornaNome(), 28)
    dizOi("Bruna", 28)
    dizOi(idade= 28, nome="Vinicius")
}

fun retornaNome():String{
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int){
    println("Oi ${nome}. Parabéns pelos seus anos ${idade} anos")
}