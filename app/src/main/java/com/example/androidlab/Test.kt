package com.example.androidlab

fun main(){
    var data1 = listOf<Int>(10, 20, 30)
    var data2 = mutableListOf<Int>(10, 20, 30)
    var data3 = mapOf<String, String>("One" to "Uno", "Two" to "Tres")
    println("""List size: ${data1.size}
        List data: ${data1[0]}, ${data1[1]}, ${data1[2]}
    """.trimIndent())
    data2[2] = 40
    println("""List size: ${data2.size}
        List data: ${data2[0]}, ${data2[1]}, ${data2[2]}
    """.trimIndent())
    fun EngToSpa(st: String): String? {
        return data3.get(st)
    }
    println(EngToSpa("One"))
    println(EngToSpa("Two"))
}