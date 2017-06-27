
fun main(args:Array<String>){

    print("enter your grade:")
    var grade= readLine()!!.toDouble() // 565.464 can be taken using double

    if(grade>= 90){
        //block of code
        println("your great go outside know the world")

    }else if(grade>=80 && grade<90){
        println("lucky dude enjoy the life")
    }else if(grade>=70 && grade<80){
        println("better luck next time")
    }else if(grade>=60 && grade<70){
        println("go enjoy,")
    }else{
        println("failed, but who cares be happy and watch a movie")
    }


    print("your grade $grade")

}