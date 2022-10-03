class Pacientes(var atencionRequerida:String, var prioridad:Int, NIDI: Int, nombre: String,
                var compañiaSeguros: String):Persona(NIDI,nombre) {

    override fun toString(): String {
        return "Pacientes(NIDI='$NIDI',Nombre='$nombre',compañiaSeguros='$compañiaSeguros',atencionRequerida='$atencionRequerida', prioridad=$prioridad)"
    }
}