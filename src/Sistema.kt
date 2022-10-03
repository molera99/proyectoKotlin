import Factorias.FactoriaMedicos

class Sistema(var turno:Array<String>?=null, var medicos:ArrayList<Medico>?=null) {
    fun añadirMedicos(){
        medicos?.add(FactoriaMedicos.crearMedico(0))
        medicos?.add(FactoriaMedicos.crearMedico(1))
    }
    fun cambiarMedicos(){
        medicos?.removeAt(0)
        medicos?.removeAt(0)
        medicos?.add(FactoriaMedicos.crearMedico(0))
        medicos?.add(FactoriaMedicos.crearMedico(1))
    }
    fun comprobarProblema(paciente:Pacientes):Medico?{
        var medico: Medico? =null
        if((medicos?.get(0)?.compañiaSeguros?.get(0)==paciente.compañiaSeguros || medicos?.get(0)?.compañiaSeguros?.get(1)==paciente.compañiaSeguros)
            && paciente.atencionRequerida=="Impacto chorritronico"){

            medico=medicos?.get(0)
        }else if((medicos?.get(1)?.compañiaSeguros?.get(0)==paciente.compañiaSeguros || medicos?.get(1)?.compañiaSeguros?.get(1)==paciente.compañiaSeguros)
            && paciente.atencionRequerida=="Quemadura laser"){
            medico=medicos?.get(1)
        }else{
            medico=null
        }
        return medico
    }

    override fun toString(): String {
        return "Sistema(turno=${turno.contentToString()}, medicos=$medicos)"
    }

    class Builder(var turno:Array<String>?=null, var medicos:ArrayList<Medico>?=null){
        fun turno(turno:Array<String>):Builder{
            this.turno = turno
            return this
        }
        fun medicos(medicos:ArrayList<Medico>):Builder {
            this.medicos = medicos
            return this
        }
        fun build():Sistema{
            return Sistema(turno,medicos)
        }
    }

}