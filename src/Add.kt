fun add(a: Int, b: Int): Int {
    return a + b
}

fun returnMeAddFunction(): ((Int, Int) -> Int) {
    // can do something and return function as well
    // returning function
    return ::add
}

val add = returnMeAddFunction()

val result = add(2, 2)

fun main() {
    add
    add(1,5)
    result
}


class Stack {

}