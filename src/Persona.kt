open abstract class Persona(var NIDI:Int, var nombre:String) {

    companion object{
        var identificacion=0
    }

    override fun toString(): String {
        return "Persona(NIDI=$NIDI, nombre='$nombre')"
    }


}