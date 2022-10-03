class Medico(var especialidad:String?=null, NIDI: Int?=null, nombre: String?=null, var compañiaSeguros: Array<String>?=null):Persona(NIDI, nombre) {

    fun atenderPaciente(pacientes:ArrayList<Pacientes>){
        pacientes.removeAt(0)
    }

    override fun toString(): String {
        return "Medico(NIDI='$NIDI',Nombre='$nombre',especialidad='$especialidad', compañiaSeguros=${compañiaSeguros.contentToString()})"
    }
    class Builder(var especialidad:String? = null, var NIDI:Int? = null, var nombre:String? = null,var compañiaSeguros: Array<String>? = null){
        fun especialidad(especialidad:String):Builder{
            this.especialidad = especialidad
            return this
        }
        fun NIDI(NIDI:Int):Builder{
            this.NIDI = NIDI
            return this
        }
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun compañiaSeguros(compañiaSeguros:Array<String>):Builder{
            this.compañiaSeguros = compañiaSeguros
            return this
        }
        fun build():Medico{
            return Medico(especialidad,NIDI,nombre,compañiaSeguros)
        }
    }
}