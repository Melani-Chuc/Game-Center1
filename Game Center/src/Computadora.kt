class Computadora (
    val num_compu:Int,
    val tipo:String,
    val sistema_opera:String,
    val disponibilidad:Boolean,
    val esta_disponible:Boolean=true,
    val descripcion:String,
)
{
    fun getComputadoraData():String{
        return "Numero de computadora: $num_compu, Tipo de computadora: $tipo, Sistemaoperativo: $sistema_opera, Disponibilidad: $disponibilidad, Esta disponible: $esta_disponible,  Descripcion: $descripcion"
    }
}