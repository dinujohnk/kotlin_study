
fun main(args:Array<String>){

    print("enter your grade:")
    var grade= readLine()!!.toDouble()

    if(grade>= 90){
        //block of code
        println("your great go outside know the world")

    }
    if(grade>=70 && grade<90 ){

        println("don't let mark decide ur future")
    }

    print("your grade $grade")

}