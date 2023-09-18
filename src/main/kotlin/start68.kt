import java.util.*
fun main(){
    val s = Scanner(System.`in`)
    val T = s.nextInt()
    for(i in 1 ..T){
        val X = s.nextInt()
        val Y = s.nextInt()
        var a = ""
        if(X>Y){
            a ="LOSS"
        }
        else if(X<Y){
            a ="PROFIT"
        }
        else {
            a ="NEUTRAL"

        }
        println("$a")


    }
}