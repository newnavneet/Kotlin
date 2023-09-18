import java.util.Scanner
fun main(){
    val reader = Scanner(System.`in`)
    val T = reader.nextInt()
    for (i in 1..T){
        val x = reader.nextInt()
        val y = reader.nextInt()
        val sum = x+y
        if (sum>6){
            println("Yes")
        }
        else
            println("No")

    }


}