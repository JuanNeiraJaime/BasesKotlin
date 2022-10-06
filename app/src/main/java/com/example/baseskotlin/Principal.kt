package com.example.baseskotlin

fun main(){
    newTopic("Primeros pasos en kotlin")
}

fun newTopic(topic: String){
    println("==================== $topic ====================")

    val a: Int = 7 // delcaracion de constante con su tipo de dato

    //declaracion de variable
    var b = 14

    println("El valor de la constante a es de: $a")
    println("El valor de la constante b es de: $b")


}