package fundamentos

fun main() {

    println("Hello word, ${retornaNome()}")
    dizOi(retornaNome());
    dizOi(retornaNome(), 38);

}

fun retornaNome(): String {
    return "Rafael";
}

fun dizOi(nome: String, idade: Int = 99){
    println("Oi ${nome}, parabens pelos seus ${idade} anos");
}



