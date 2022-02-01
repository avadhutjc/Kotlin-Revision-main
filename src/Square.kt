class Square(var side: Int) {
    fun area(): Int {
        return side * side
    }
}

fun main() {
    fun Square.perimeter(): Int {
        return 4 * side
    }
    val obj = Square(2)
    println(obj.area())
    print(obj.perimeter())
}
/*
4
8
Process finished with exit code 0
 */