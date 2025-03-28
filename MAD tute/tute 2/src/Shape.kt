open class Shape(var Name : String ,var edge : Int)  {
    open fun getedge(){
        println(edge)
    }
}

class Square(Name : String ,edge : Int) : Shape(Name , edge){
    fun getName(){
        println("Name : $Name")
    }
    override fun getedge(){
        println("edge : $edge")
    }
}

fun main (){
    val s1 = Square("Square" , 4)
    s1.getName()
    s1.getedge()
}

