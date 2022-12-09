package com.example.happybrithday


// if | else는 의사결정에 사용이 된다.

// = 할당 연산자
// 불리언 표현식 양쪽에 있는 값이나 변수를 비교하는 비교 연산자로 구성 ==
// == : 값을 서로 비교하는 비교 연산자.

/*
미만: < 결과: False
초과: > 결과: False
이하: <= 결과: True
이상: >= 결과: True
같지 않음 != 결과: False
 */




//trafficLightColor == "Red" 표현식은 true 값을 반환하므로 println("Stop") 문이 실행되어 Stop 메시지가 출력
/* if else if else 문
fun main() {
    val trafficLightColor = "Green"

    if(trafficLightColor == "Red"){
        println("Stop")
    } else if(trafficLightColor == "Yellow") {
        println("Slow")

    } else if(trafficLightColor == "Green") {
        println("Go")
    } else{
        println("Invalid traffic-light color")
    }
}
 */




// else 브랜치 추가
// 신호등이 빨간색이 아닐때 이동하라고 운전자에게 알리도록 프로그램 확장
// if/else else 추가

// 고려할 브랜치가 3개 이상인 경우 -> When문
// 1~2개 인경우 if else if else 쓰는게 좋다.




/* 신호등 When 문
fun main(){
    val trafficLightColor = "Yellow"

    when(trafficLightColor){
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light, color")

    }
}
 */

// when 더 복잡한 조건 달성
/*
fun main(){
    val x = 20
/* 방법 1
    when (x){
        2 -> println("x is a prime number between 1 and 10.")
        3 -> println("x is a prime number between 1 and 10.")
        5 -> println("x is a prime number between 1 and 10.")
        7 -> println("x is a prime number between 1 and 10.")
        else -> println("x is a prime number between 1 and 10.")
    }
    // 정리
    when (x){
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10. ")
        else -> println("x isn't a prime number between 1 and 10. ")
    }
 */

    // 여러 조건에 in 키워드? 사용
    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x isn't a number between 1 and 10.")
        else -> println("x isn't a number.")


    }
}

 */

fun main(){
    val trafficLightColor = "Yellow"

    when(trafficLightColor){
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
    }
}