fun main(args: Array<String>)
{
    //declaring a data class
    data class family(val name: String,val height:Int,val wight:Int)

    //declaring a variable of the above data class
    //and initializing values to all parameters
    val man1=family("saad",150,60)
    val ledy1=family("saba",154,56)
    //printing all the details of the data class
    println(man1.toString());
    println(ledy1.toString())
}