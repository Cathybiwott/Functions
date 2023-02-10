fun main(args: Array<String>){
    greetPerson("Cathy")
    remainder(59,8)
    var sum =addition(num1=20, num2=15, num3=10, num4=45)
    println(sum)
    var String="I am a loving person"
    println(String)

}

fun greetPerson(name: String){
    println("Hello $name" )
}

fun remainder(num1:Int, num2:Int):Int{
    var remainder =num1%num2
    println(remainder)
    return(remainder)
}

fun addition(num1:Int, num2:Int, num3:Int, num4:Int):Int{
    var sum=num1+num2+num3+num4
    return(sum)
}

fun statement(Cathy:String):String{
    return(Cathy)
}