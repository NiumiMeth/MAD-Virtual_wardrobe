class Hospital {
    var name = ""
    var address = ""
    var patient_count = 0

    fun Display(){
        println("Name: $name")
        println("Address: $address")
        println("Patient: $patient_count")
    }
}

fun main(){
    val h1 = Hospital()

    h1.name="Gov Hospital"
    h1.address="Hospitaladd"
    h1.patient_count = 150

    h1.Display()

}