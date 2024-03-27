class Computadora (
  val direeccionIP: String,
    val informacion: String,
    val disponible: Boolean=true
) {

 fun getEquipoData ():String {
        return "INFORMACION DEL EQUIPO: $informacion DIRRECION IP: $direeccionIP DISPONIBILIDAD: ${if (disponible)"SI" else "NO"}"
    }
}
