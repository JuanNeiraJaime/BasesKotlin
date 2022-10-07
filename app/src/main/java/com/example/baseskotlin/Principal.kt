package com.example.baseskotlin

fun main(){
    newTopic("Primeros pasos en kotlin")

    print("    ====================")
    print("IMPRESIONES")
    println("====================")

    newTopic("Variables y constantes")

    val a: Int = 7 // declaracion de constante con su tipo de dato

    //declaracion de variable
    var b = 14
    //string template
    println("El valor de la constante a es de: $a")
    println("El valor de la constante b es de: $b")

    newTopic("Funciones")

    //hola() no se puede acceder ya que es privada
}

fun newTopic(topic: String){
    println("==================== $topic ====================")



}