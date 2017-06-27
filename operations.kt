//math operators
fun main(args:Array<String>){
    println("enter no:")// one number
    var x:Float = readLine()!!.toFloat() // operations are better done in float
    println("enter no:")//second number
    var y:Float = readLine()!!.toFloat() // kotlin input is direvtly converted
    var sum:Float?
    sum = x+y
    println("sum :" + sum)
}