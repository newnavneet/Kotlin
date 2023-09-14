import java.util.*
fun main(){
    val sc = Scanner(System.`in`)
    val T = sc.nextInt()
    for(i in 1 .. T){
        val N = sc.nextInt()
        val D = arrayOf(1200,100,1200,1500)

        val remove = D.count { it > 1000 }
        println("$remove")


    }

}