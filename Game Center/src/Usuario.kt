class Usuario (
    val nombre:String,
    val apellidos:String,
    val nombre_usuario:String,
    val direccion:String,
    val num_telefono:Int,
    val correo:String,
    val puesto_trabajo:String,
)
{
    fun getUsuarioData():String{
        return "Nombre: $nombre, Apellidos: $apellidos, Nombre de Usuario: $nombre_usuario, Direccion: $direccion, Numero de telefono:$num_telefono, Puesto de trabajo: $puesto_trabajo, Correo electronico: $correo"
    }

}