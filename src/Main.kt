
fun main() {
    val Lslibros = mutableListOf<Libro>()
    val libro1 = Libro("El solitario", "Juan", "123", 50, 25000.0, 5)
    val libro2 = Libro("El romantico", "santiago", "456", 90, 28000.0, 10)
    val libro3 = Libro("El depresivo", "JuanTarazona", "789", 100, 45000.0, 20)
    Lslibros.add(libro1)
    Lslibros.add(libro2)
    Lslibros.add(libro3)
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
                print("Ingresa el ISBN del libro a prestar: ")
                val isbn = readLine() ?: ""
                val libro = Lslibros.find { it.isbn == isbn }
                if (libro != null) {
                    if (libro.prestar()) println("Libro prestado.")
                    else println("No está disponible.")
                } else {
                    println("Libro no encontrado.")
                }
            }
            "2" -> {
                print("Ingresa el ISBN del libro a devolver: ")
                val isbn = readLine() ?: ""
                val libro = Lslibros.find { it.isbn == isbn }
                if (libro != null) {
                    libro.devolver()
                    println("Libro devuelto.")
                } else {
                    println("Libro no encontrado.")
                }
            }
            "3" -> {
                print("Ingresa el ISBN del libro para ver información: ")
                val isbn = readLine() ?: ""
                val libro = Lslibros.find { it.isbn == isbn }
                if (libro != null) println("Información del libro: $libro")
                else println("Libro no encontrado.")
            }
            "4" -> println("Saliendo...")
            else -> println("Opción no válida.")
        }
    } while (opcion != "4")
}