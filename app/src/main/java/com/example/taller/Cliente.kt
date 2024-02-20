package com.example.taller

class Cliente(
    nombreCompleto: String,
    documentoIdentidad: String,
    sexo: String,
    correoElectronico: String,
    val direccionCorrespondencia: String,
    val telefono: String
) : Persona(nombreCompleto, documentoIdentidad, sexo, correoElectronico)