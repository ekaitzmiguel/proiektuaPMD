package com.example.proiektuapmd.data

class Langilea(
    nan: String,
    izenabizenak: String,
    generoa: String?,
    var erabiltzailea: String,
    var pasahitza: String,
    var egunekoOrduak: Int,
    var kargua: Kargua
) : Persona(
    nan.uppercase(),
    izenabizenak,
    generoa
) {

    override fun bistaratu(): String {
        return "$nan - $izenabizenak - $kargua"
    }
}