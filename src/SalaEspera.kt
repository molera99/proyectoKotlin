class SalaEspera(var pacientes:ArrayList<Pacientes>) {
    fun ordenarPacientes(): ArrayList<Pacientes> {
        var pacientesOrdenados=pacientes?.sortedBy { it.prioridad }
        pacientes=ArrayList(pacientesOrdenados)
        return pacientes
    }

    override fun toString(): String {
        return "SalaEspera(pacientes=$pacientes)"
    }


}