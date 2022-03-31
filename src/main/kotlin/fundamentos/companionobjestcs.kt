package fundamentos

class MinhaClasse(var nome: String, var endereco: String, var idade: Int) {
    companion object {
        fun criaClasseComValoresPadrao(): MinhaClasse {
            return MinhaClasse("Rafael", "Rua 10" ,37);
        }
    }

}

class SegundaClasse(var nome: String, var endereco: String, var idade: Int) {
    fun criaClasseComValoresPadrao(): SegundaClasse {
        return SegundaClasse("Rafael", "Rua 10" ,37);
    }
}

fun main() {
    //É necessário instaciar a classe para utilizar o método
    var segundaClasse = SegundaClasse("teste","teste",12).criaClasseComValoresPadrao();

    //Não é neceesário instanciar a classe para uitilizar o método, da para user em builders.
    var minhaClasse = MinhaClasse.criaClasseComValoresPadrao();
}
