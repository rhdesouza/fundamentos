package fundamentos

import java.util.*

fun main() {
    testeWhen(12)
    println(comecaComOi("OI, tudo bem"))
}


fun testeWhen(x: Int) {
    when (x) {
        5, -5 -> println(x)
        8 -> println(x)
        10 -> {
            println(x)
            println("Uma dezena")
        }
        in 11..15 -> println("Esta entre 11 e 15")
        !in 16..20 -> println("Não esta entre 16 a 20")
        else -> println("numero nao mapeado")
    }
}

fun comecaComOi(x: Any): Boolean {
    return when (x) {
        is String -> x.lowercase().startsWith("oi")
        else -> false
    }
}