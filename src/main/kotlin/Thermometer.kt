class Thermometer {

    private var _celcius : Double

    constructor(celcius : Double){
        this._celcius = celcius
    }



    var celcius : Double
    get(){
        return this._celcius
    }
        set(value:Double){
        this._celcius = value
    }




}