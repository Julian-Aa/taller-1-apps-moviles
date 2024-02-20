package com.example.taller

class Empresa(
    val razonSocial: String,
    val nit: String,
    val direccion: String,
    val empleados: List<Empleado>,
    val clientes: List<Cliente>
) {
    // Función para obtener la nómina total de la empresa
    fun obtenerNominaTotal(): Double {
        return empleados.sumByDouble { it.salario }
    }

    // Función para obtener la nómina por dependencia
    fun obtenerNominaPorDependencia(dependencia: String): Double {
        return empleados.filter { it.dependencia == dependencia }.sumByDouble { it.salario }
    }

    // Función para obtener el porcentaje de clientes según su sexo
    fun obtenerPorcentajeClientesPorSexo(sexo: String): Double {
        val totalClientes = clientes.size
        val clientesPorSexo = clientes.count { it.sexo == sexo }
        return (clientesPorSexo.toDouble() / totalClientes) * 100
    }

    // Función para obtener la cantidad de empleados según el nombre del cargo
    fun obtenerCantidadEmpleadosPorCargo(nombreCargo: String): Int {
        return empleados.count { it.cargo.nombre == nombreCargo }
    }

    // Función para obtener el empleado que lleva más tiempo en la empresa e indicar a qué dependencia pertenece
    fun obtenerEmpleadoMasAntiguo(): Pair<Empleado, String> {
        val empleadoMasAntiguo = empleados.minByOrNull { it.añoIngreso }
        val dependenciaEmpleadoMasAntiguo = empleadoMasAntiguo?.dependencia ?: ""
        return Pair(empleadoMasAntiguo!!, dependenciaEmpleadoMasAntiguo)
    }
}
