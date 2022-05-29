package com.example.androidlab

fun main(){
    var data = 10
    var result = if (data>0){
        println("data > 0")
        true
    }else{
        println("data <= 0")
        false
    }
    println(result)
}