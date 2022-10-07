package com.example.baseskotlin

fun main(){
    println(hola())
    //newTopic("Prueba encapsulamiento")
    println(suma(5,3))
    println( resta(3,2))
    println(multiplicacion(4,8) )
    println(division(10,2))

    println("===== Resultados ===== \nMultiplicacion = ${multiplicacion(4,9)}" +
            " \nDivision = ${division(10,2)} \nSuma = ${suma(5,5)}" +
            " \nResta = ${resta(5,1)}")

}



//: al definir Unit como valor de retorno quiere decir que esta funcion es un procedimiento
private fun hola(): String
{
    var saludo: String = "Hola kotlin"
    return saludo
}

private fun suma(a: Int, b: Int): Int{
    var res = a+b
    return res
}

private fun resta(a: Int, b: Int):Int {
    return a-b
}

private fun multiplicacion(a: Int, b: Int): Int{
    return a*b
}

private fun division(a: Int, b: Int): Int{
    return a/b
}

