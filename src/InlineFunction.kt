//
fun doSomething() {
    println("doSomething start");
    doSomethingElse() { }
    println("doSomething end");
}

inline fun doSomethingElse(myFun: () -> Unit) {
    myFun()
    println("code inside inline function")
}

fun main() {
    doSomething()
}
/*
doSomething start
code inside inline function
doSomething end

Process finished with exit code 0
 */

//fun normalFunction() {
//    println("This is normal function.")
//    inlineFunctionExample( {
//            println("Inlined Functions")
//            return@inlineFunctionExample //compiler error here
//        },
//        { println("Instead of object creation it copies the code.") }
//    )
//    println("This is normal function closing")
//}
//
//inline fun inlineFunctionExample(crossinline myFunction: () -> Unit, another: () -> Unit) {
//    myFunction()
//    another()
//    print("Finally it's working fine!")
//}


//below is tricky questions check for more understanding
/*
fun doSomething() {
    println("doSomething Start-1")
    doSomethingElse()
    println("doSomething End-2")
}

fun doSomethingElse() {
    println("doSomethingElse")
}

fun main() {
    doSomething()
    doSomethingElse()
}
/*
doSomething Start-1
doSomethingElse
doSomething End-2
doSomethingElse

Process finished with exit code 0
 */
 */