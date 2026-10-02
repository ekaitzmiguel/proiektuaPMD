package com.example.proiektuapmd.data

class Bezeroa(
    nan: String,
    izenabizenak: String,
    generoa: String?,
    var altaData: String,
    var diruSarrera: String
) : Persona(
    nan.uppercase(),
    izenabizenak,
    generoa
) {

    var entrenamenduak: String = ""

    override fun bistaratu(): String {
        return "$nan - $izenabizenak - $altaData"
    }
}