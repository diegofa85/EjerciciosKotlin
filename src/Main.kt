//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    var almacen: Almacen = Almacen()
    var agua: Agua = Agua("Manantial", 1, 1.5, 3.0, "AquaPure")
    almacen.agregarBebida(agua)
    almacen.mostrarBebida()
    almacen.eliminarBebida(1)
    almacen.mostrarBebida()
}