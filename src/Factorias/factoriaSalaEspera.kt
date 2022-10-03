package Factorias

import Pacientes
import SalaEspera

object factoriaSalaEspera {
    fun crearSalaEspera():SalaEspera{
        var listaPacientes=ArrayList<Pacientes>()
        var salaEspera=SalaEspera(listaPacientes)
        return salaEspera
    }
}