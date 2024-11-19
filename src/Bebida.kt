open class Bebida(var id: Int, var litros: Double, var precio: Double, var marca: String) {

    open fun getInfo() {
        println("ID: $id")
        println("Litros: $litros")
        println("Precio: $precio€")
        println("Marca: $marca")
    }
}
