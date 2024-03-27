class ComputadoraController {
  val listaEquipo = mutableListOf<Equipo>()

    fun regristrodeEquipo() {
        println("INGRSE LA DIRRECION IP")
        val direccionIP = readln().toString()
        println("INGRESE INFORMACION DEL EQUIPO (MARCA Y VERSION DEL EQUIPO)")
        val informacion = readln().toString()

        val addedEquipo = Equipo(direccionIP, informacion)

        listaEquipo.add(addedEquipo)
    }

    fun modifyEquipo(modifiedEquipo: Equipo, index: Int) {
        listaEquipo[index] = modifiedEquipo
    }

    fun getEquipobyIndex(index: Int):Equipo{
            return listaEquipo[index]
    }

    fun showEquipo() {
        if (listaEquipo.isEmpty()) {
            println("NO HAY EQUIPOS REGRISTRADOS")
        } else {
            var contador = 1
            for (equipo in listaEquipo) {
                println("$contador" + equipo.getEquipoData())
                contador ++
                }
            }
        }
    fun arenotEquipoRegristado():Boolean=listaEquipo.isEmpty()
}
