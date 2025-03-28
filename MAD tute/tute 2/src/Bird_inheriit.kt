open class Bird_inheriit {
    var color = "Green"
}

class Parrot:Bird_inheriit(){
    fun myfunction(){
        println(color)
    }
}

fun main(){
    var myO1 = Parrot()
    myO1.myfunction()
}