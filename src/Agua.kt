class Agua(var origen: String, id: Int, litros: Double, precio: Double, marca: String): Bebida(id, litros, precio, marca){

    override fun getId(): Int {
        return super.getId()
    }

    override fun getInfo() {
        println("Origen: $origen")
        super.getInfo()
    }

}