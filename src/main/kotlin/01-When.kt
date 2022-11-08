fun testWhen(){
    //When express
    val day = 13

    when(day){
        1 -> println("วันขึ้นปีใหม่")
        8 -> println("วันลอยกระทง")
        13 -> println("วันสงกรานต์")
        31 -> println("วันปล่อยผี")
        else-> println("Invalid Day")
    }
}

fun testWhen2(){
    val day = 31
    val result = when(day){
        1->"วันขึ้นปีใหม่"
        8->"วันลอยกระทง"
        13->"วันสงกรานต์"
        31->"วันปล่อยผี"
        else->"Invalid Day"
    }
    println(result)
}

fun testWhen3(){
    val day = 2
    val result = when(day){
        1,2,3,4,5-> "Weekday"
        else-> "Weekend"
    }
    println(result)
}

fun testWhen4(){
    val day = 2
    val result = when(day){
        in 1..5 -> "Weekday"
        else -> "Weekend"
    }
    println(result)
}

fun testWhen5(){
    val day = 2
    val result = when(day) {
        1->{
            println("First day of the week")
            println("Monday")
        }
        2->{
            println("Secon day of the week")
            println("Tuesday")
        }
        3->{
            println("Third day of the week")
            println("Wednesday")
        }
        4-> println("Thursday")
        else->"Invalid day"
    }

}