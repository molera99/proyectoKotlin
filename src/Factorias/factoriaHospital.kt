package Factorias

import Hospital
import Pacientes

object factoriaHospital {
    fun crearHospital():Hospital{
        var listaPacientes=ArrayList<Pacientes>()
        var hospital=Hospital.Builder().pacientes(listaPacientes).build()
        return hospital
    }
}