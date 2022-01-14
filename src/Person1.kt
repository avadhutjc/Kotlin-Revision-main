class Person1 {
    lateinit var name: String
    fun initializeName() {
        println(this::name.isInitialized)
        name = "MindOrks" // initializing name
        println(this::name.isInitialized)
    }

}

fun main() {
    Person1().initializeName()
}


/*
'lateinit' modifier is allowed only on mutable properties

    lateinit val name: String

 */
