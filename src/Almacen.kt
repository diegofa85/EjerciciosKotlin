class Almacen() {

    var array1: Array<Bebida?> = arrayOfNulls(5)
    var array2: Array<Bebida?> = arrayOfNulls(5)
    var array3: Array<Bebida?> = arrayOfNulls(5)
    var array4: Array<Bebida?> = arrayOfNulls(5)
    var array5: Array<Bebida?> = arrayOfNulls(5)
    var y: Int = 0
    var precioTotal: Double = 0.0
    var precioMarca: Double = 0.0
    var precioColumna: Double = 0.0

    fun agregarBebida(b: Bebida) {
        try {
            for (posicion in array1.indices) {
                if (b.id == array1[posicion]?.id) {
                    println("Bebida ya Guardada")
                    y = 1
                    return
                }
            }
            for (posicion in array2.indices) {
                if (b.id == array2[posicion]?.id) {
                    println("Bebida ya Guardada")
                    y = 1
                    return
                }
            }
            for (posicion in array3.indices) {
                if (b.id == array3[posicion]?.id) {
                    println("Bebida ya Guardada")
                    y = 1
                    return
                }
            }
            for (posicion in array4.indices) {
                if (b.id == array4[posicion]?.id) {
                    println("Bebida ya Guardada")
                    y = 1
                    return
                }
            }
            for (posicion in array5.indices) {
                if (b.id == array5[posicion]?.id) {
                    println("Bebida ya Guardada")
                    y = 1
                    return
                }
            }

            if (y != 1) {
                for (posicion in array1.indices) {
                    if (array1[posicion] == null) {
                        array1[posicion] = b
                        return
                    }
                }
                for (posicion in array2.indices) {
                    if (array2[posicion] == null) {
                        array2[posicion] = b
                        return
                    }
                }
                for (posicion in array3.indices) {
                    if (array3[posicion] == null) {
                        array3[posicion] = b
                        return
                    }
                }
                for (posicion in array4.indices) {
                    if (array4[posicion] == null) {
                        array4[posicion] = b
                        return
                    }
                }
                for (posicion in array5.indices) {
                    if (array5[posicion] == null) {
                        array5[posicion] = b
                        return
                    }
                }
            }
        } catch (e: NullPointerException) {
            println("Error: Intento de acceder a un elemento nulo en el arreglo. ${e.message}")
        }
    }

    fun eliminarBebida(id: Int) {
        try {
            for (posicion in array1.indices) {
                if (array1[posicion]?.id == id) {
                    array1[posicion] = null
                }
            }
            for (posicion in array2.indices) {
                if (array2[posicion]?.id == id) {
                    array2[posicion] = null
                }
            }
            for (posicion in array3.indices) {
                if (array3[posicion]?.id == id) {
                    array3[posicion] = null
                }
            }
            for (posicion in array4.indices) {
                if (array4[posicion]?.id == id) {
                    array4[posicion] = null
                }
            }
            for (posicion in array5.indices) {
                if (array5[posicion]?.id == id) {
                    array5[posicion] = null
                }
            }
        } catch (e: NullPointerException) {
            println("Error al intentar eliminar bebida: ${e.message}")
        }
    }

    fun mostrarBebida() {
        try {
            for (posicion in array1.indices) {
                array1[posicion]?.getInfo()
            }
            for (posicion in array2.indices) {
                array2[posicion]?.getInfo()
            }
            for (posicion in array3.indices) {
                array3[posicion]?.getInfo()
            }
            for (posicion in array4.indices) {
                array4[posicion]?.getInfo()
            }
            for (posicion in array5.indices) {
                array5[posicion]?.getInfo()
            }
        } catch (e: NullPointerException) {
            println("Error al mostrar bebida: ${e.message}")
        }
    }

    fun calcularPrecio(): String {
        try {
            for (posicion in array1.indices) {
                precioTotal += array1[posicion]?.precio ?: 0.0
            }
            for (posicion in array2.indices) {
                precioTotal += array2[posicion]?.precio ?: 0.0
            }
            for (posicion in array3.indices) {
                precioTotal += array3[posicion]?.precio ?: 0.0
            }
            for (posicion in array4.indices) {
                precioTotal += array4[posicion]?.precio ?: 0.0
            }
            for (posicion in array5.indices) {
                precioTotal += array5[posicion]?.precio ?: 0.0
            }
        } catch (e: NullPointerException) {
            println("Error al mostrar bebida: ${e.message}")
        }
        return ("El precio total de todas las bebidas es: $precioTotal€")
    }

    fun calcularPrecio(marca: String): String {
        try {
            for (posicion in array1.indices) {
                if (array1[posicion]?.marca.equals(marca)) {
                    precioMarca += array1[posicion]?.precio ?: 0.0
                }
            }
            for (posicion in array2.indices) {
                if (array2[posicion]?.marca.equals(marca)) {
                    precioMarca += array2[posicion]?.precio ?: 0.0
                }
            }
            for (posicion in array3.indices) {
                if (array3[posicion]?.marca.equals(marca)) {
                    precioMarca += array3[posicion]?.precio ?: 0.0
                }
            }
            for (posicion in array4.indices) {
                if (array4[posicion]?.marca.equals(marca)) {
                    precioMarca += array4[posicion]?.precio ?: 0.0
                }
            }
            for (posicion in array5.indices) {
                if (array5[posicion]?.marca.equals(marca)) {
                    precioMarca += array5[posicion]?.precio ?: 0.0
                }
            }
        } catch (e: NullPointerException) {
            println("Error al mostrar bebida: ${e.message}")
        }
        return ("El precio total de todas las bebidas de la marca $marca es: $precioMarca€")
    }

    fun calcularPrecio(columna: Int): String {
        try {
            precioColumna += array1[columna - 1]?.precio ?: 0.0
            precioColumna += array2[columna - 1]?.precio ?: 0.0
            precioColumna += array3[columna - 1]?.precio ?: 0.0
            precioColumna += array4[columna - 1]?.precio ?: 0.0
            precioColumna += array5[columna - 1]?.precio ?: 0.0
        } catch (e: NullPointerException) {
            println("Error al mostrar bebida: ${e.message}")
        }
        return ("El precio total de todas las bebidas de la columna $columna es: $precioColumna€")
    }
}
