import java.awt.Color

fun main() {
    println("Hello World!")

    val b1 = Bird()

    b1.type = "parrot"
    b1.color = "Green"

    println(b1.type)
    println(b1.color)

}

class Bird {
    var type = ""
    var color = ""
}