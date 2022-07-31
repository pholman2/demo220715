import java.time.LocalDateTime

fun main () {

    val c = Car();
    c.numberPlate = " ABC123 "
}

class Car{

    //field
    private var _numberPlate: String = ""

    //property
    var numberPlate : String
        get() {
            return this._numberPlate
        }
        set(value){
            this._numberPlate = value
        }
}




