


enum class Result(val data: String) {
    SUCCESS("Success"),
    ERROR("Error")
}

fun main() {
    Result.ERROR
    Result.SUCCESS
}