package fundamentos

fun main() {

    //Operador Elvis
    var nome: String? = null
    var tamanhoNome = nome?.length ?: 0
    println(tamanhoNome);

}