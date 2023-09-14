fun main(){
    val num = arrayOf( 26, 54, 43, 15 ,53 ,75 )
    var large = num[0]
    for (i in num)
        if (large < i){
            large = i
        }
    println("The largest element is = $large")

}



