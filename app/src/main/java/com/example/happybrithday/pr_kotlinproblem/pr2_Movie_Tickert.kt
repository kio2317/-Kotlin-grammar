package com.example.happybrithday.pr_kotlinproblem


/*
---
주제: 연령을 기준으로 티켓 가격을 계산하는 프로그램을 작성
---
문제
만 12세 이하 어린이용 티겟 가격 15달러
만 13~60세용 표준 티켓 가격 30달러. 월요일에는 이 연령대를 대상으로 표준 티켓 가격을 25달러로 할인합니다.
만 61세 이상용 노인 티켓 가격 20달러, 영화 관람자의 최대 연령을 100세로 가정합니다.
-1 값은 사용자가 연령 분류에 속하지 않는 연령을 입력하는 경우
유효하지 않은 가격을 나타냅니다.
---
결과
The movie ticket price for a person aged 5 is $15.
The movie ticket price for a person aged 28 is $25.
The movie ticket price for a person aged 87 is $20.
---
솔류션 코드 참고
if|else 가 아닌when문 쓰면 된다.
in 0  .. 12 ->15 형식을 지킬 것
*/

fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is  \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}



fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age){
        in 0..12 -> 15
        in 13..60 -> if (isMonday) 25 else 30
        in 61..100 -> 20
        else -> -1
    }
}


/*
 시도 1
fun ticketPrice(age: Int, isMonday: Boolean): Int {
    return when(age){
        in 0..12 = 15
                in 13..60 (isMonday) 30 else 25
        in 61..100 = 20
                -1
    }
}
*/

