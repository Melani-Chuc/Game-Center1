class TemporizadorController {
    private val temporizador = Temporizador()

    fun iniciarTemporizador() {
        temporizador.iniciarTemporizador()
    }

    fun detenerTemporizador() {
        temporizador.detenerTemporizador()
    }

    fun agregarTiempo(tiempoMinutos: Int) {
        temporizador.agregarTiempo(tiempoMinutos)
    }

    fun calcularTiempoTotal(): Long {
        return temporizador.calcularTiempoTotal()
    }
}