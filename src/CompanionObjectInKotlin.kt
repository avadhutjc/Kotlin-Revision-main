class CompanionObjectInKotlin {
}

class ToBeCalled {
    fun callMe() {
        print("Yoo are calling me: ")
    }
}

fun main() {
    var obj = ToBeCalled()
    obj.callMe()
}