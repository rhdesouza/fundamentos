package fundamentos

data class Carro(var cor: String, val anoFabricacao: Int, val dono: Dono){

}

data class Dono (var nome: String, val idade: Int){

}

fun main(){
    var carro = Carro("Branco",2021, Dono("Rafael",38));
    println(carro.cor);
    carro.cor = "vermelho";
    println(carro.cor);

    println(carro);
    carro.dono.nome = "Rafael Henrique";

    println(carro);
}