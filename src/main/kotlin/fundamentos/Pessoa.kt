package fundamentos

class Pessoa( var nome: String, var idade: Int, var signo: String) {
// todos os objetos chama esse tostring para printar
    override fun toString(): String {
        return "Classe: Pessoa, Nome: ${nome}, Idade: ${idade}, Signo: ${signo}"
    }
}

fun main(){
    var bruna = Pessoa("Bruna",28, "Gêmeos")
    println(bruna)
}


// classe são definiçoes do mundo real, portadora de todas as inforamaoes exemplo se eu usar uma pessoa como classe.
// atributos ou parametros são
// construtor é o que a gente utiliza para criar uma nova pessoa
// data?