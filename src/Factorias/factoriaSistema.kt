package Factorias

import Medico
import Pacientes
import Sistema

object factoriaSistema {
    fun crearSistema():Sistema{
        var turnos= arrayOf("0:00 a 8:00","8:00 a 16:00","16:00 a 0:00")
        var listaMedicos=ArrayList<Medico>()
        var sistema=Sistema(turnos,listaMedicos)
        return sistema
    }
}