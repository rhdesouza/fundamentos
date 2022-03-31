package fundamentos

fun main(){
    var pessoa: Pessoa? = Pessoa("Rafael",37)
    println(pessoa!!.nome)

    //pessoa = null;
    println(pessoa!!.nome)
}