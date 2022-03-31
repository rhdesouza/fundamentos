package fundamentos

fun main() {
    println(parOuImpar(3))
    println(resultadoNota(5))
}


fun parOuImpar(num: Int): String {
    return if (num % 2 == 0) "Par" else "Ímpar"
}

fun resultadoNota(nota: Int): String {
    return if (nota >= 6) {
        "aprovado"
    } else if (nota > 4) {
        "Recuperação"
    } else {
        "Reprovado"
    }
}