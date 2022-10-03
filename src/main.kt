import Factorias.FactoriaPacientes
import Factorias.factoriaHospital
import Factorias.factoriaSalaEspera
import Factorias.factoriaSistema

fun main(){
    var tiempo=0
    var dia=1
    var paciente:Pacientes
    var medico:Medico?
    var eleccionTurno=0
    var sala1=factoriaSalaEspera.crearSalaEspera()
    var sala2=factoriaSalaEspera.crearSalaEspera()
    var sala3=factoriaSalaEspera.crearSalaEspera()
    var hospital=factoriaHospital.crearHospital()
    var sistema=factoriaSistema.crearSistema()
    sistema.añadirMedicos()
    while(dia<8){
        if(tiempo%2==0) {
            if(sala1.pacientes.size<=sala2.pacientes.size && sala1.pacientes.size<=sala3.pacientes.size){
                sala1.pacientes.add(FactoriaPacientes.crearPaciente())
                sala1.pacientes= sala1.ordenarPacientes()
            }else if(sala2.pacientes.size<=sala1.pacientes.size && sala2.pacientes.size<=sala3.pacientes.size){
                sala2.pacientes.add(FactoriaPacientes.crearPaciente())
                sala2.pacientes= sala2.ordenarPacientes()
            }else{
                sala3.pacientes.add(FactoriaPacientes.crearPaciente())
                sala3.pacientes= sala3.ordenarPacientes()
            }

        }
        if(tiempo%4==0) {
            if(sala1.pacientes.size>=sala2.pacientes.size && sala1.pacientes.size>=sala3.pacientes.size){
                paciente=sala1.pacientes[0]
                medico=sistema.comprobarProblema(paciente)
                if (medico!=null){
                    medico.atenderPaciente(sala1.pacientes)
                    println(informe(paciente, medico, sistema, eleccionTurno, dia))
                }else{
                    hospital.recogerPaciente(paciente,sala1)
                    println(informeHospital(paciente, eleccionTurno, dia, sistema))
                }
            }else if(sala2.pacientes.size>=sala1.pacientes.size && sala2.pacientes.size>=sala3.pacientes.size){
                paciente=sala2.pacientes[0]
                medico=sistema.comprobarProblema(paciente)
                if (medico!=null){
                    medico.atenderPaciente(sala2.pacientes)
                    println(informe(paciente, medico, sistema, eleccionTurno, dia))
                }else{
                    hospital.recogerPaciente(paciente,sala2)
                    println(informeHospital(paciente, eleccionTurno, dia, sistema))
                }
            }else{
                paciente=sala3.pacientes[0]
                medico=sistema.comprobarProblema(paciente)
                if (medico!=null){
                    medico.atenderPaciente(sala3.pacientes)
                    println(informe(paciente, medico, sistema, eleccionTurno, dia))
                }else{
                    hospital.recogerPaciente(paciente,sala3)
                    println(informeHospital(paciente, eleccionTurno, dia, sistema))
                }
            }

        }
        if(tiempo%10==0) {
            sistema.cambiarMedicos()
            if(eleccionTurno==2){
                eleccionTurno=0
            }
            eleccionTurno++
        }
        if(tiempo%30==0){
            dia++
        }
        tiempo++
    }

}
fun informe(paciente:Pacientes,medico:Medico,sistema:Sistema,eleccionTurno:Int,dia:Int):String{

    return "El paciente $paciente ha sido atentido por el medico $medico" +
            " en el turno ${sistema.turno?.get(eleccionTurno)} en el dia $dia"
}
fun informeHospital(paciente: Pacientes,eleccionTurno:Int,dia:Int,sistema:Sistema):String{

    return "El paciente $paciente ha sido mandado al hospital en el turno ${sistema.turno?.get(eleccionTurno)} en el dia $dia"
}