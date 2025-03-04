
fun main() {
    val Lslibros = mutableListOf<Libro>()
    val libro1 = Libro("El solitario", "Juan", "14569", 50, 25000.0, 5)
    Lslibros.add(libro1)
    println("Lista de libros: $Lslibros")

    var opcion: String?
    do {
        println("\nOpciones:")
        println("1: Prestar libro")
        println("2: Devolver libro")
        println("3: Información del libro")
        println("4: Salir")
        print("Elige una opción: ")

        opcion = readLine()

        when (opcion) {
            "1" -> {
                if (libro1.prestar()) println("Libro prestado.")
                else println("No está disponible.")
            }
            "2" -> {
                libro1.devolver()
                println("Libro devuelto.")
            }
            "3" -> println("Información del libro: $libro1")
            "4" -> println("Saliendo...")
            else -> println("Opción no válida.")
        }
    } while (opcion != "4")
}
