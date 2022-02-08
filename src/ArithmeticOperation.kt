//https://www.tutorialkart.com/kotlin/kotlin-sealed-class/

sealed class ArithmeticOperation

class Add(val a: Int, val b: Int) : ArithmeticOperation()
class Subtract(val a: Int, val b: Int) : ArithmeticOperation()
class Multiply(val a: Int, val b: Int) : ArithmeticOperation()
class Divide(val a: Int, val b: Int) : ArithmeticOperation()

fun execute(op: ArithmeticOperation) = when (op) {
    is Add -> op.a + op.b
    is Subtract -> op.a - op.b
    is Multiply -> op.a * op.b
    is Divide -> op.a / op.b
}


fun main(args: Array<String>) {
    val a = 4 ; val b = 3
    val operation1 = Add(a, b)
    val result1 = execute(operation1)
    println("Addition : $result1")

    val operation2 = Subtract(a, b)
    val result2 = execute(operation2)
    println("Subtraction : $result2")

    val operation3 = Multiply(a, b)
    val result3 = execute(operation3)
    println("Multiplication : $result3")

    val operation4 = Divide(a, b)
    val result4 = execute(operation4)
    println("Division : $result4")
}
/*
Addition : 7
Subtraction : 1
Multiplication : 12
Division : 1
Process finished with exit code 0
 */

