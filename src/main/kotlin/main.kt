fun main() {
    /*calcularCubo()
    comvertirKmAMetros()
    detectarSigno()
    calcularMenorNumero()
    calcularOperacionesBasicas()
    calcularOperacionesDeSumaYMultiplicacion()
    calcularAreaYPerimetro()
    calcularAreaDeCuadrado()
    numerosPrimos()
    calcularElPromedio()
    tiempo()
    determinarSiEsParONo()
    tiempoEnMin()
    valorAbsolutoDeNumeroEntero()
    divisibilidad()*/
    cualEsElMenor()
}


// Ejercicio 1
fun calcularCubo() {
    println("\nProblema 1: Crear una función que permita calcular el cubo de un número\n")
    var numero: Double = 0.0

    print("Ingrese numero: ")
    numero = readLine()!!.toDouble()

    println("el cubo es: ${Math.pow(numero,3.0).toInt()}")
}
// Ejercicio 2
fun comvertirKmAMetros() {
    println("\nProblema 2: Crear un programa que permita leer el valor correspondiente a una distancia en kilómetros y las visualice expresada en metros. (Propuesto)\n")
    var kilometros: Int = 0

    print("Ingrese cantidad de km: ")
    kilometros = readLine()!!.toInt()

    println("La cantidad en metros es: ${kilometros*1000}m")
}
// Ejercicio 3
fun detectarSigno() {
    println("\nProblema 3: Crear una función que reciba un número y devuelva un numero con el valor de: -1 si el número es negativo, 1 si el número es positivo o 0 si es cero.\n")
    var numero: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()


    if (numero < 0) {
        println("-1 [Negativo]")
    } else if (numero > 0) {
        println("1 [positivo]")
    } else {
        println("0 [neutro]" )
    }
}
// Ejercicio 4
fun calcularMenorNumero() {
    println("\nProblema 4: Crear una función que calcule cual es el número menor de dos números enteros. (Propuesto)\n")
    var numero1: Int = 0
    var numero2: Int = 0

    print("Ingrese numero: ")
    numero1 = readLine()!!.toInt()
    print("Ingrese numero: ")
    numero2 = readLine()!!.toInt()

    if (numero1 < numero2){
        println("El menor es: $numero1")
    } else println("El menor es: $numero2")
}
// Ejercicio 5
fun calcularOperacionesBasicas() {
    println("\nProblema 5: Facilite el ingreso de 2 números, muestre su suma, resta, multiplicación, división y resto (modulo) de la división.\n")
    var primerNumero: Int = 0
    var segundoNumero: Int = 0

    print("Ingrese primer numero: ")
    primerNumero = readLine()!!.toInt()
    print("Ingrese segundo numero: ")
    segundoNumero = readLine()!!.toInt()

    println("Suma: ${primerNumero+segundoNumero}")
    println("Resta: ${primerNumero-segundoNumero}")
    println("Multiplicacion: ${primerNumero*segundoNumero}")
    println("Division: ${primerNumero.toDouble()/segundoNumero.toDouble()}")
    println("Resto: ${primerNumero%segundoNumero}")
}
// Ejercicio 6
fun calcularOperacionesDeSumaYMultiplicacion() {
    println("\nProblema 6: Facilite el ingreso de tres números, muestre su respectiva suma y multiplicación. (Propuesto)\n")
    var primerNumero: Int = 0
    var segundoNumero: Int = 0
    var tercerNumero: Int = 0

    print("Ingrese primer numero: ")
    primerNumero = readLine()!!.toInt()
    print("Ingrese segundo numero: ")
    segundoNumero = readLine()!!.toInt()
    print("Ingrese tercer numero: ")
    tercerNumero = readLine()!!.toInt()

    println("Suma: ${primerNumero + segundoNumero + tercerNumero}")
    println("Multiplicacion: ${primerNumero * segundoNumero * tercerNumero}")
}
// Ejercicio 7
fun calcularAreaYPerimetro() {
    println("\n Problema 7: Calcular el área y el perímetro de un rectángulo dada la base y altura.\n")
    var base: Int = 0
    var altura: Int = 0

    print("Ingrese base de rectangulo: ")
    base = readLine()!!.toInt()
    print("Ingrese altura de rectangulo: ")
    altura = readLine()!!.toInt()

    println("El Area del rectangulo es: ${(base*altura)}")
    println("El Perimetro del rectangulo es: ${(base*2)+(altura*2)}")
}
// Ejercicio 8
fun calcularAreaDeCuadrado() {
    println("\nProblema 8: Calcule el área de un cuadrado. (Propuesto)\n")
    var lado: Int = 0

    print("Ingrese lado del cuadrado: ")
    lado = readLine()!!.toInt()

    println("El Area del cuadrado es: ${lado * lado}")
}
//ejercicio9
fun numerosPrimos() {
    println("\nProblema 9: Desarrolle una Función que reciba un número y devuelva el valor 1 si es un número primo o 0 en caso contrario.\n")
    var numero: Int = 0
    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    if (numero == 1 || numero == 2) {
        println("1 [primo]")
    } else {
        // Para pares
        if (numero % 2 == 0) {
            println("0 [no primo]")
        } else {
            // Para divisibles por 1 y por sí mismo
            var contador: Int = 0
            for (i in 1..numero) {
                if (numero % i == 0) {
                    contador++
                }
            }
            if (contador > 2) {
                println("0 [no primo]")
            } else {
                println("1 [primo]")
            }
        }
    }
}
// Ejercicio 10
fun calcularElPromedio() {
    println("\nProblema 10: Desarrolle un programa que permita ingresar tres números, obtener su promedio y visualizar \"Aprobado\", si su promedio es mayor a 10.5, caso contrario visualizara \"Mejore la nota\".(Propuesto)\n")
    var primerNumero: Double = 0.0
    var segundoNumero: Double = 0.0
    var tercerNumero: Double = 0.0
    var promedio: Double = 0.0

    print("Ingrese numero: ")
    primerNumero = readLine()!!.toDouble()
    print("Ingrese numero: ")
    segundoNumero = readLine()!!.toDouble()
    print("Ingrese numero: ")
    tercerNumero = readLine()!!.toDouble()

    promedio = (primerNumero + segundoNumero + tercerNumero) / 3
    println("El promedio es: $promedio")


    if (promedio > 10.5)
        println("Aprobado")
    else println("Mejore la nota")
}
// Ejercicio 11
fun tiempo() {
    println(
        "\nProblema 11: Que exprese en horas, minutos y segundos un tiempo expresado en segundos.\n"
    )
    var numero: Int = 0
    var horas: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    horas = numero / 3600
    numero = (numero % 3600)
    minutos = numero / 60
    segundos = numero % 60
    println("El tiempo es: ($horas)h ($minutos)m ($segundos)s ")
}
// Ejercicio 12
fun determinarSiEsParONo() {
    println("\nProblema 12: Desarrolle un programa que permita ingresar un número y a través de una función diga si es par o impar. (Propuesto)\n")

    var numero: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()

    if (numero == 0) {
        println("El numero es: $numero")
    } else {
        if (numero % 2 == 0)
            println("El $numero es Par")
        else println("El $numero es Impar")
    }
}
// Ejercicio 13
fun tiempoEnMin() {
    println(
        "\nProblema 13: Desarrolle un programa del cual de un tiempo ingresado en minutos, visualizarlo por pantalla en horas, minutos y segundos.\n"
    )
    var numero: Double = 0.0
    var numeroEntero: Int = 0
    var horas: Int = 0
    var minutos: Int = 0
    var segundos: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toDouble()
    numeroEntero = numero.toInt()

    horas = numeroEntero / 60
    minutos = numeroEntero % 60
    segundos = ((numero - numeroEntero.toDouble())* 60).toInt()
    println("El tiempo es: ($horas)h ($minutos)m ($segundos)s ")
}
// Ejercicio 14
fun valorAbsolutoDeNumeroEntero() {
    println("\nProblema 14: Determinar e imprimir el valor absoluto de un número entero (Propuesto)\n")

    var numero: Int = 0

    print("Ingrese numero: ")
    numero = readLine()!!.toInt()
    if (numero < 0){
        numero *= -1
    }
    println("El Valor Absoluto es: $numero")
}
// Ejercicio 15
fun divisibilidad() {
    println("\nProblema 15: Determinar si un número es divisible por otro e imprimir divisible, caso contrario visualizar no es divisible.\n")
    var numero1: Int = 0
    var numero2: Int = 0

    print("Ingrese numero: ")
    numero1 = readLine()!!.toInt()
    print("Ingrese numero: ")
    numero2 = readLine()!!.toInt()

    if (numero1 % numero2 == 0){
        println("Es divisible")
    } else println("No es divisible")
}
// Ejercicio 16
fun cualEsElMenor() {
    println("\nProblema 15: Determinar si un número es divisible por otro e imprimir divisible, caso contrario visualizar no es divisible.\n")
    var numero1: Int = 0
    var numero2: Int = 0
    var numero3: Int = 0

    print("Ingrese numero: ")
    numero1 = readLine()!!.toInt()
    print("Ingrese numero: ")
    numero2 = readLine()!!.toInt()
    print("Ingrese numero: ")
    numero3 = readLine()!!.toInt()

    if (numero1 < numero2 && numero1 < numero3)
        println("El menor es: $numero1")
    else if (numero2 < numero3)
        println("El menor es: $numero2")
    else println("El menor es: $numero3")

}



