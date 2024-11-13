class Almacen() {

    var array1: Array<Bebida?> = arrayOfNulls(5)
    var array2: Array<Bebida?> = arrayOfNulls(5)
    var array3: Array<Bebida?> = arrayOfNulls(5)
    var array4: Array<Bebida?> = arrayOfNulls(5)
    var array5: Array<Bebida?> = arrayOfNulls(5)
    var y: Int = 0

    fun agregarBebida(b: Bebida) {

        for (posicion in array1.indices){
            if (b.getId() == array1.get(posicion)!!.getId()) {
                println("Bebida ya Guardada")
                y = 1
            }
        }
        for (posicion in array2.indices){
            if (b.getId() == array2.get(posicion)!!.getId()) {
                println("Bebida ya Guardada")
                y = 1
            }
        }
        for (posicion in array2.indices){
            if (b.getId() == array2.get(posicion)!!.getId()) {
                println("Bebida ya Guardada")
                y = 1
            }
        }
        for (posicion in array2.indices){
            if (b.getId() == array2.get(posicion)!!.getId()) {
                println("Bebida ya Guardada")
                y = 1
            }
        }
        for (posicion in array2.indices){
            if (b.getId() == array2.get(posicion)!!.getId()) {
                println("Bebida ya Guardada")
                y = 1
            }
        }

        if (y != 1) {
            for (posicion in array1.indices){
                if (array1.get(posicion) == null) {
                    array1.set(posicion, b)
                }
            }
            for (posicion in array2.indices){
                if (array2.get(posicion) == null) {
                    array2.set(posicion, b)
                }
            }
            for (posicion in array3.indices){
                if (array3.get(posicion) == null) {
                    array3.set(posicion, b)
                }
            }
            for (posicion in array4.indices){
                if (array4.get(posicion) == null) {
                    array4.set(posicion, b)
                }
            }
            for (posicion in array4.indices){
                if (array4.get(posicion) == null) {
                    array4.set(posicion, b)
                }
            }
            y = 0
        }

    }

    fun eliminarBebida(id: Int) {

        for (posicion in array1.indices){
            if (array1.get(posicion)!!.getId() == id) {
                array1.set(posicion, null)
            }
        }
        for (posicion in array2.indices){
            if (array2.get(posicion)!!.getId() == id) {
                array2.set(posicion, null)
            }
        }
        for (posicion in array3.indices){
            if (array3.get(posicion)!!.getId() == id) {
                array3.set(posicion, null)
            }
        }
        for (posicion in array4.indices){
            if (array4.get(posicion)!!.getId() == id) {
                array4.set(posicion, null)
            }
        }
        for (posicion in array5.indices){
            if (array5.get(posicion)!!.getId() == id) {
                array5.set(posicion, null)
            }
        }
    }

    fun mostrarBebida() {

        for (posicion in array1.indices){
            if (array1.get(posicion) != null) {
                array1.get(posicion)!!.getInfo()
            }
        }
        for (posicion in array2.indices){
            if (array2.get(posicion) != null) {
                array2.get(posicion)!!.getInfo()
            }
        }
        for (posicion in array3.indices){
            if (array3.get(posicion) != null) {
                array3.get(posicion)!!.getInfo()
            }
        }
        for (posicion in array4.indices){
            if (array4.get(posicion) != null) {
                array4.get(posicion)!!.getInfo()
            }
        }
        for (posicion in array5.indices){
            if (array5.get(posicion) != null) {
                array5.get(posicion)!!.getInfo()
            }
        }
    }
}