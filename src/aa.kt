//fun main() {
//    var name: String = "MindOrks"
//    name = null
//}
/*

Kotlin: Null can not be a value of a non-null type String
 */

fun main() {
    var name: String? = "MindOrks"
    print(name?.length) // ok
    name = null
}

