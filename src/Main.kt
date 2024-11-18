//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var almacen: Almacen = Almacen()
    var agua1: Agua = Agua("Manantial", 1, 1.5, 1.0, "AquaPure")
    var agua2: Agua = Agua("Manantial", 2, 1.5, 1.0, "Fuensanta")
    var agua3: Agua = Agua("Manantial", 3, 1.5, 1.0, "Fuensanta")
    val azucarada1 = Azucarada(15, true, 101, 1.5, 3.0,  "Coca-Cola")
    val azucarada2 = Azucarada(15, false, 102, 1.5, 3.0,  "Coca-Cola")
    val azucarada3 = Azucarada(15, true, 103, 1.5, 3.0,  "Pepsi")
    almacen.agregarBebida(agua1)
    almacen.agregarBebida(agua2)
    almacen.agregarBebida(agua3)
    almacen.agregarBebida(azucarada1)
    almacen.agregarBebida(azucarada2)
    almacen.agregarBebida(azucarada3)
    almacen.mostrarBebida()
    println(almacen.calcularPrecio())
    println(almacen.calcularPrecio("Pepsi"))
    println(almacen.calcularPrecio(1))
}