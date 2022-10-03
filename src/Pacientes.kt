class Pacientes(var atencionRequerida:String?=null, var prioridad:Int?=null, NIDI: Int?=null, nombre: String?=null,
                var compañiaSeguros: String?=null):Persona(NIDI,nombre) {

    override fun toString(): String {
        return "Pacientes(NIDI='$NIDI',Nombre='$nombre',compañiaSeguros='$compañiaSeguros',atencionRequerida='$atencionRequerida', prioridad=$prioridad)"
    }
    class Builder(var atencionRequerida:String? = null,var prioridad:Int?=null, var NIDI:Int? = null, var nombre:String? = null,var compañiaSeguros: String? = null){
        fun atencionRequerida(atencionRequerida:String):Builder{
            this.atencionRequerida = atencionRequerida
            return this
        }
        fun NIDI(NIDI:Int):Builder{
            this.NIDI = NIDI
            return this
        }
        fun prioridad(prioridad:Int):Builder{
            this.prioridad = prioridad
            return this
        }
        fun nombre(nombre:String):Builder{
            this.nombre = nombre
            return this
        }
        fun compañiaSeguros(compañiaSeguros:String):Builder{
            this.compañiaSeguros = compañiaSeguros
            return this
        }
        fun build():Pacientes{
            return Pacientes(atencionRequerida, prioridad, NIDI, nombre,compañiaSeguros)
        }
    }
}