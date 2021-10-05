package fundamentos

class Carro( var cor: String, var anoDeFabricacao: Int, val proprietario: Proprietario) {
}

data class Proprietario(var nome: String, var idade: Int){
}

fun main(){
    var carro = Carro ("Branca", 1996, Proprietario("Bruna", 28))

    println(carro.cor)
    println(carro.anoDeFabricacao)
    println(carro.proprietario)
    println("----------------------------------")
    carro.cor = "Preto"
    carro.anoDeFabricacao = 2021
    println(carro.cor)
    println(carro.anoDeFabricacao)
}
//acessando atraves dos pontos