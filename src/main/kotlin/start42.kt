import java.util.Scanner
fun main(){
    val reader = Scanner(System.`in`)
    val T = reader.nextInt()
    for(i in 1..T){
        val x = reader.nextInt()
        val y = reader.nextInt()
        val A = reader.nextInt()
        if(A>=x&&A<y){
            println("Yes")
        }
        else{
            println("No")
        }

    }
}