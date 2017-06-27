import sun.util.resources.cldr.aa.CalendarData_aa_ER
import java.util.*

fun main(args:Array<String>) {


    //input
    println("enter your year of birth:")
    var DOB:Int= readLine()!!.toInt()
    //process
    var year = Calendar.getInstance().get(Calendar.YEAR)
    var age = year-DOB

    //output
    println("your age is $age years")
}