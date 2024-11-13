class Azucarada(val porcentajeAzucar: Int, val promocion: Boolean, id: Int, litros: Double, precio: Double, marca: String): Bebida(id, litros, precio, marca) {

    init {

        if (promocion) {

            this.precio = precio * 0.9
        }
    }

    fun getPrecio () {


    }

    override fun getInfo() {
        println("Porcentaje de Azucar: $porcentajeAzucar")
        println("Promocion: $promocion")
        super.getInfo()
    }
}