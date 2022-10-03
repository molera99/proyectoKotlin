class Pacientes(var atencionRequerida:String, var prioridad:Int, NIDI: Int, nombre: String,
                compañiaSeguros: String):Persona(NIDI,nombre,compañiaSeguros) {

    override fun toString(): String {
        return "Pacientes(NIDI='$NIDI',Nombre='$nombre',compañiaSeguros='$compañiaSeguros',atencionRequerida='$atencionRequerida', prioridad=$prioridad)"
    }
}