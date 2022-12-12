package com.example.happybrithday

import androidx.core.location.LocationRequestCompat.Quality

// 함수 참조 연산자 :: 함수명에 사용 해야 한다.

fun main() {
    val coins: (Int) -> String = {
        "$it quarters"
    }

    val treatFunction = trickOrTreat(false,{"it quarters"}) // isTrick 매개변수에 관한 false
    val trickFunction = trickOrTreat(true,null) // isTrick 매개변수에 관한 true
    treatFunction()
    trickFunction()
    repeat(4){
        treatFunction()
    }
    trickFunction()
}

fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int)-> String)?) : () -> Unit {
    if(isTrick){
        return trick
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat
    }
}


val trick = {
    println("No treats!")
}


// treat 변수의 데이터 유형을 () -> Unit로 지정합니다.
val treat = {
    println("Have a treat!")
}