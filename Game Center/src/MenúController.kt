class MenúController {
  val ControllerUsuario = ControllerUsuario()
  val ControllerEquipo = ControllerEquipo()

    fun paginadeinicio() {
        println("BIENVENIDO...")
        println("( 1.)CREAR CUENTA")
        println("( 2.)INICIAR SESION")
        val paginicio = readln().toInt()
        when (paginicio) {
            1 -> {
                ControllerUsuario.registodeUsuario()
            }

            2 -> {
                ControllerUsuario.iniciodesecion()
                if (ControllerUsuario.isValidUser("HECTOR", "HCTORkeb12")) {
                    println("INGRSE UNA OPCION")
                    println("(1)VER LOS EQUIPPOS DISPONIBLES")
                    println("(2)REGRISTAR EQUIPO")
                    val opcionUsuario = readln().toInt()
                    when (opcionUsuario) {
                        1-> {
                            ControllerEquipo.showEquipo()
                        }
                        2-> {
                        ControllerEquipo.regristrodeEquipo()
                        }
                    }

                }


                }
            }
        }
    }

}
