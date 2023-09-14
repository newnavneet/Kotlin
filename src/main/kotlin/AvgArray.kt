fun main(){
    val nums = arrayOf( 25, 26 , 27 , 28 ,45)
    var sum = 0
    for (i in nums){
        sum += i
    }
    val avg = sum/nums.size
    println("is = %d".format(avg))

}