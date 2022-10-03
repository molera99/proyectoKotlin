package Factorias

import Medico
import Persona.Companion.identificacion
import kotlin.random.Random

object FactoriaMedicos {
    fun crearMedico():Medico{
        var NIDI= identificacion
        identificacion++
        var compañias= arrayOf("Sanitroopers", "Vaderslas","Yodacare")
        var eleccion= Random.nextInt(0,3)
        var compañiaSeguros=compañias[eleccion]
        var nombres= arrayOf("Juan","Carlos","David","Miguel","Arturo","Maria","Clara")
        eleccion= Random.nextInt(0,7)
        var nombre=nombres[eleccion]
        var especialidades= arrayOf("Traumatologia","Medicina interna")
        eleccion= Random.nextInt(0,2)
        var especialidad=especialidades[eleccion]
        var medico=Medico(especialidad,NIDI,nombre, compañiaSeguros)
        return medico
    }


}