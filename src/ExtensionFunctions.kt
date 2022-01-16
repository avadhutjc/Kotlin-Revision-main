// A sample class to demonstrate extension functions
class Circle(val radius: Double) {
    // member function of class
    fun area(): Double {
        return Math.PI * radius * radius; //   r^2*PI
    }
}

fun main() {
    // Extension function created for a class Circle
    fun Circle.perimeter(): Double {
        return 2 * Math.PI * radius; //2 *PI * r
    }
    // create object for class Circle
    val obj = Circle(2.5);
    // invoke member function
    println("Area of the circle is ${obj.area()}")
    // invoke extension function
    println("Perimeter of the circle is ${obj.perimeter()}")
}