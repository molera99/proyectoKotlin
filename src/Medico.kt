class Medico(var especialidad:String, NIDI: Int, nombre: String, var compañiaSeguros: Array<String>):Persona(NIDI, nombre) {

    fun atenderPaciente(pacientes:ArrayList<Pacientes>){
        pacientes.removeAt(0)
    }

    override fun toString(): String {
        return "Medico(NIDI='$NIDI',Nombre='$nombre',especialidad='$especialidad', compañiaSeguros=${compañiaSeguros.contentToString()})"
    }

}