class Hospital(var pacientes:ArrayList<Pacientes>?=null) {
    fun recogerPaciente(paciente:Pacientes,sala:SalaEspera){
        pacientes?.add(paciente)
        sala.pacientes?.removeAt(0)
    }

    override fun toString(): String {
        return "Hospital(pacientes=$pacientes)"
    }
    class Builder(var pacientes:ArrayList<Pacientes>?=null){
        fun pacientes(pacientes:ArrayList<Pacientes>):Builder{
            this.pacientes = pacientes
            return this
        }
        fun build():Hospital{
            return Hospital(pacientes)
        }
    }

}