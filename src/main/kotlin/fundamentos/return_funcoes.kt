package fundamentos

//temos uma funcao que tem por parametro numero inteiro que ira receber uma string
fun returnarNumeroPorExtenso(numero: Int): String {
    if(numero == 5){
        return "Cinco"
    }else if(numero == 6){
        return "seis"
    }else{
        return "numero nao mapeado"
    }
}

fun main(){
    println(returnarNumeroPorExtenso(16))
}