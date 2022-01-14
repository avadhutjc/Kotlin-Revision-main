class NullSafe {
    var a = arrayListOf(1, 2, 3)
}

fun main() {
    val name: String = "Lloyd"
    print(name)
    NullSafe().a
}