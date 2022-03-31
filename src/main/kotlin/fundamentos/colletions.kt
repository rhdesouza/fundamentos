package fundamentos

fun main(){
    //Lista não mutavel
    var list = listOf<Int?>(1,2,3, null)
    val pares = list.filter { it == 2 }
    println(pares)

    //Lista Mutavel
    var lista = mutableListOf(1,2,3,4,5)
    lista.add(8)
    println (lista.filter { it ===8 })


    //lista de objetos
    var listaObj = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    println(listaObj)

    listaObj["Bruno"] = 30
    println(listaObj)

    listaObj.remove("Bruno")
    println(listaObj)

    listaObj.putIfAbsent("Bruno",24)
    println(listaObj)

}