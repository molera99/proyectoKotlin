open abstract class Persona(var NIDI:Int?=null, var nombre:String?=null) {

    companion object{
        var identificacion=0
    }

    override fun toString(): String {
        return "Persona(NIDI=$NIDI, nombre='$nombre')"
    }


}