class StaticMethodInKotlin {
}

class CompanionClass {
    companion object Test {
        fun callMe() =
            print("This block is static Block")

        var someInteger: Int = 10
    }

    fun notStaticMethod() {
        println("This block is not static block")
    }
}

fun main() {
    val c = CompanionClass()
    c.notStaticMethod() //this is not static so we need to create obj of class then called method from that class

    CompanionClass.callMe()  //this is static method so we called  this way ...need not to create obj for static method
    println(CompanionClass.Test.someInteger)
}
/*
This block is not static block
This block is static Block10
 */