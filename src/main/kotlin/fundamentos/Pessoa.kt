package fundamentos

class Pessoa(var nome: String, var idade: Int) {

    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, idade: ${idade}";
    }

}

fun main(){
    var rafael = Pessoa("Rafael",38);

    println(rafael)
}