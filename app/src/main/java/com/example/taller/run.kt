package com.example.taller

fun main() {
    // Crear algunos empleados
    val cargoGerente = Cargo("Gerente", 3)
    val cargoAnalista = Cargo("Analista", 2)
    val empleado1 = Empleado("Juan Perez", "123456789", "M", "juan@example.com", 5000.0, "Ventas", 2010, listOf(), cargoGerente)
    val empleado2 = Empleado("Maria Lopez", "987654321", "F", "maria@example.com", 4000.0, "Recursos Humanos", 2015, listOf(), cargoAnalista)
    val empleado3 = Empleado("Pedro Ramirez", "456789123", "M", "pedro@example.com", 6000.0, "Gerencia", 2008, listOf(empleado1, empleado2), cargoGerente)

    // Crear algunos clientes
    val cliente1 = Cliente("Laura Torres", "1122334455", "F", "laura@example.com", "Calle 123", "1234567")
    val cliente2 = Cliente("Carlos Gutierrez", "5544332211", "M", "carlos@example.com", "Av. Principal", "7654321")

    // Crear la empresa
    val empresa = Empresa("Empresa ABC", "123456789", "Calle Principal", listOf(empleado1, empleado2, empleado3), listOf(cliente1, cliente2))

    // Ejemplos de uso de las funciones
    println("Nómina total de la empresa: ${empresa.obtenerNominaTotal()}")
    println("Nómina de la dependencia 'Ventas': ${empresa.obtenerNominaPorDependencia("Ventas")}")
    println("Porcentaje de clientes masculinos: ${empresa.obtenerPorcentajeClientesPorSexo("M")}%")
    println("Cantidad de empleados con cargo 'Gerente': ${empresa.obtenerCantidadEmpleadosPorCargo("Gerente")}")
    val (empleadoMasAntiguo, dependencia) = empresa.obtenerEmpleadoMasAntiguo()
    println("El empleado más antiguo es ${empleadoMasAntiguo.nombreCompleto}, pertenece a la dependencia $dependencia")
}