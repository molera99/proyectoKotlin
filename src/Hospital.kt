class Hospital(var pacientes:ArrayList<Pacientes>) {
    fun recogerPaciente(paciente:Pacientes,sala:SalaEspera){
        pacientes.add(paciente)
        sala.pacientes.removeAt(0)
    }
}