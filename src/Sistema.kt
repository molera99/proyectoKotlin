import Factorias.FactoriaMedicos

class Sistema(var turno:Array<String>, var medicos:ArrayList<Medico>) {
    fun añadirMedicos(){
        medicos.add(FactoriaMedicos.crearMedico(0))
        medicos.add(FactoriaMedicos.crearMedico(1))
    }
    fun cambiarMedicos(){
        medicos.removeAt(0)
        medicos.removeAt(0)
        medicos.add(FactoriaMedicos.crearMedico(0))
        medicos.add(FactoriaMedicos.crearMedico(1))
    }
    fun comprobarProblema(paciente:Pacientes):Medico?{
        var medico: Medico? =null
        if((medicos[0].compañiaSeguros[0]==paciente.compañiaSeguros || medicos[0].compañiaSeguros[1]==paciente.compañiaSeguros)
            && paciente.atencionRequerida=="Impacto chorritronico"){
            medico=medicos[0]
        }else if((medicos[1].compañiaSeguros[0]==paciente.compañiaSeguros || medicos[1].compañiaSeguros[1]==paciente.compañiaSeguros)
            && paciente.atencionRequerida=="Quemadura laser"){
            medico=medicos[1]
        }else{
            medico=null
        }
        return medico
    }
}