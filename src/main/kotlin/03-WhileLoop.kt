fun testWhileLoop(){
    var i = 1
    var sum = 0
    while(i <= 5){
        sum += i //sum = sum +1
        println("Line $i")
            ++i
    }
    println("sum = $sum")
}