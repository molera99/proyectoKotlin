package Factorias

import Medico
import Persona.Companion.identificacion
import kotlin.random.Random

object FactoriaMedicos {
    fun crearMedico(tipoEspecialidad:Int):Medico{
        var NIDI= identificacion
        identificacion++
        var compañias= arrayOf("Sanitroopers", "Vaderslas","Yodacare")
        var eleccion= Random.nextInt(0,3)
        var compañia1=compañias[eleccion]
        eleccion= Random.nextInt(0,3)
        while(compañia1==compañias[eleccion]) {
            eleccion= Random.nextInt(0,3)
        }
        var compañia2=compañias[eleccion]
        var compañiaSeguros= arrayOf(compañia1,compañia2)
        var nombres= arrayOf("Juan","Carlos","David","Miguel","Arturo","Maria","Clara")
        eleccion= Random.nextInt(0,7)
        var nombre=nombres[eleccion]
        var especialidades= arrayOf("Traumatologia","Medicina interna")
        var especialidad=especialidades[tipoEspecialidad]
        var medico=Medico.Builder().NIDI(NIDI).nombre(nombre).especialidad(especialidad).compañiaSeguros(compañiaSeguros).build()
        return medico
    }


}