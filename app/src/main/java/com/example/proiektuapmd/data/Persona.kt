package com.example.proiektuapmd.data

open class Persona(
    val nan: String,
    var izenabizenak: String,
    var generoa: String?
) {

    var kontaktua: String = ""

    open fun bistaratu(): String {
        return "$nan - $izenabizenak - $generoa"
    }
}