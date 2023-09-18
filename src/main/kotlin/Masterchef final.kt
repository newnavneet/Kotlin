
fun main() {
    val t = readLine()!!.toInt()
    repeat(t){
        val x = readLine()!!.toInt()
        when (x){
            in 1 .. 10 -> println("Yes")

        else  -> {
            println("NO") }
        }
    }
}
