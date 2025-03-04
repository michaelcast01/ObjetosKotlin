class Libro {

    var titulo: String =""
    var autor: String = ""
    var isbn: String = ""
    var numerodepaginas: Int =0
    var precio: Double = 0.0
    var disponible: Int = 0

    constructor()
    constructor(titulo: String, autor: String, isbn: String, numerodepaginas: Int, precio: Double, disponible: Int) {
        this.titulo = titulo
        this.autor = autor
        this.isbn = isbn
        this.numerodepaginas = numerodepaginas
        this.precio = precio
        this.disponible = disponible
    }

    fun prestar(): Boolean {
        return if (disponible > 0) {
            disponible--
            true
        } else {
            false
        }
    }
    fun devolver(): Boolean {
        disponible++
        return true
    }
    override fun toString(): String {
        return "Libro(titulo='$titulo', autor='$autor', isbn=$isbn, numerodepaginas=$numerodepaginas, precio=$precio, disponible=$disponible)"
    }

}
