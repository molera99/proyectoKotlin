package Factorias

import Pacientes
import Persona.Companion.identificacion
import kotlin.random.Random

object FactoriaPacientes {
    fun crearPaciente():Pacientes{
        var atenciones= arrayOf("Quemadura laser","Impacto chorritronico","Otros")
        var eleccion= Random.nextInt(0,3)
        var atencionRequerida=atenciones[eleccion]
        var NIDI=identificacion
        identificacion++
        var compañias= arrayOf("Sanitroopers", "Vaderslas","Yodacare")
        eleccion= Random.nextInt(0,3)
        var compañiaSeguros=compañias[eleccion]
        var nombres= arrayOf("Juan","Carlos","David","Miguel","Arturo","Maria","Clara")
        eleccion= Random.nextInt(0,7)
        var nombre=nombres[eleccion]
        var prioridades= arrayOf(1,2,3)
        eleccion= Random.nextInt(0,3)
        var prioridad=prioridades[eleccion]
        var paciente=Pacientes.Builder().NIDI(NIDI).nombre(nombre).compañiaSeguros(compañiaSeguros).atencionRequerida(atencionRequerida).prioridad(prioridad).build()
        return paciente
    }
}





