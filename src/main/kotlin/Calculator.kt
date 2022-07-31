class Calculator {

    fun parse(s: String): Int {

        var parts = s.split(" ")

        var x = parts[0].toInt()
        var y = parts[2].toInt();

        var op = parts[1]

        if(op == "*"){
            return x * y
        }
        else if(op == "-"){
            return x - y
        }

        return 0

    }

    fun add(x : Int, y : Int) : Int{
        return x + y
    }

    fun isEvenNumber(x:Int) : Boolean{
        return x % 2 == 0
    }

    fun isOddNumber(x:Int) : Boolean{
        return x % 2 != 0
    }

}