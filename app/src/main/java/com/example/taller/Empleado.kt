package com.example.taller

class Empleado(
    nombreCompleto: String,
    documentoIdentidad: String,
    sexo: String,
    correoElectronico: String,
    val salario: Double,
    val dependencia: String,
    val añoIngreso: Int,
    val subordinados: List<Empleado>,
    val cargo: Cargo
) : Persona(nombreCompleto, documentoIdentidad, sexo, correoElectronico)