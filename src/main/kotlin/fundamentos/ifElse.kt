package fundamentos

fun main (){
    resultadoDaNota(5)
    resultadoDaNota(10)
    resultadoDaNota(3)

    println(parOuImpar(6))
    println(parOuImpar(3))
}

fun parOuImpar(numero: Int) : String{
    return if(numero % 2 == 0) {
        "Par"
    }else {
        "impar"
    }
}

//retornar para funcao o valor que está dentro do if
fun resultadoDaNota(nota: Int){
    if(nota >= 6){
        println("passou")
    }else if (nota >=4 ){
        println("Recuperação")
    }else {
        println("reprovado")
    }
}