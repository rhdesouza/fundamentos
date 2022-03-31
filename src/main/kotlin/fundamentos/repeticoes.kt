package fundamentos

fun main(){
    //print1a10();
    //print10a1();
    //printaPar1a10();
    whileMenor10()
}

fun print1a10(){
    for (numero in 1 ..10){
        println(numero);
    }
}

fun print10a1(){
    for (numero in 10 downTo 1){
        println(numero);
    }
}

fun printaPar1a10(){
    for (numero in 2 ..10 step 2){
        println(numero);
    }
}

fun whileMenor10(){
    var x = 0
    while (x<10){
        println(x)
        x++
    }
}

