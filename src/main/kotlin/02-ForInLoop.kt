fun testForInLoop(){
    for (x in 1..5){
        println(x)
    }
}

fun testForInLoop2(){
    val min = 1
    val max = 6
    var count = 0
    for(i in min..max){
        if(i % 3 == 0){ //1%3=1
            count = count + 1
        }
    }
    println("Count = " + count)
}

fun testForInLoop3(){
    for(i in 0 until 101 step 20){
        println(i)
    }
}

fun testForInLoop4(){
    for(i in 10 downTo 4){
        println(i)
    }
}

fun testForInLoop5(){
    for(i in 1..5) print(i)
    println()
    for(i in 5..1) print(i)
    println()
    for(i in 5 downTo 1) print(i)
    println()
    for(i in 1..5 step 2) print(i)
    println()
    for(i in 5 downTo 1 step 2) print(i)
}

fun testForLoopArray(){
    var language = arrayOf("Ruby","Kotlin","Python","Java")
    for(item in language){
        print(item+ ",")
    }
}

fun testForLoopString(){
    var text = "Kotlin"

    for(letter in text){
        print(letter)
    }
}