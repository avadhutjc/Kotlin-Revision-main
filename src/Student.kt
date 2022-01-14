// Protected modifier example

// Visible just inside this file
private const val noOfStudents = 1000

// Visible just inside this file
open class Student1() {
    // Visible just inside the Student class and its subclass
    protected val newCount = noOfStudents
}

// Visible inside this file
class StudentManager : Student1() {
    // Visible inside the StudentManager class
    // newCount is visible because StudentManager is a subclass of Student
    private val finalCount = newCount
}

/*
// ERROR: protected modifier is not allowed for top level declarations
protected const val noOfStudent: Int = 10000 //declare here only private

// ERROR: protected modifier is not allowed for top level declarations
protected class Staff() //declare here private or internal
*/