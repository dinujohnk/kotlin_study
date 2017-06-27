
fun main(args:Array<String>){

    print("enter your grade:")
    var grade= readLine()!!.toDouble()

    if(grade>= 90){
        //block of code
        if(grade< 95) {
            println("your great go outside know the world")
        }else{
            println("showoff")
        }
    }

    print("your grade $grade")

}