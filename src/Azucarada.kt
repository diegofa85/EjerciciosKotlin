class Azucarada(val porcentajeAzucar: Int, val promocion: Boolean, id: Int, litros: Double, precio: Double, marca: String): Bebida(id, litros, precio, marca) {

    init {
        if (promocion) {
            this.precio = precio * 0.9
        }
    }

    override fun getInfo() {
        println("Porcentaje de Azúcar: $porcentajeAzucar%")
        if (promocion == true) {
            println("Promoción: Sí")
        } else {
            println("Promoción: No")
        }
        super.getInfo()
    }
}
