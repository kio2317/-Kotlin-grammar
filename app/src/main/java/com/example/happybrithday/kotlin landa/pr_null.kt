package com.example.happybrithday

import java.io.PipedReader

/*
var로 정의된 변수를 동일한 유형의 서로 다른 값에 재할당할 수 있다.
null 허용 하는 유형 null 보유 할 수 있는 변수
null 허용 하지 않는 유형 null 보유 할 수 없는 변수
-
null을 보유하도록 명시적으로 지정하는 경우에만 null을 허용하는 유형
null 뒤에 String데이터 유형은 null을 허용하지 않는 유형이므로 변수를 재할당하지 못합니다.

---
변수 선언 유형 끝에 ? 연산자 추가
Stirng? null을 보유 할 수 있다
 */

/*코드
null 연습
fun main(){

var favoriteActor: String? = "Sandra Oh"
   println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}*/


/*코드
null을 허용하는 변수 처리
fun main(){
    var number : Int? = 10
    println(number)

    number = null
    println(number)
}

// null을 전달할 수 있는 변수에는 null을 허용하는 변수를 사용
// null을 전달할 수 없는 변수에는 null을 허용하지 않는 변수를 사용
// null을 허용하는 변수에 액세스하려면 더 복잡한 처리가 필요하기 때문입니다.
 */
/*
null 을 허용하는 변수 처라
length 글자 수 출력(공백 포함)
Kotlin은 null 안전성을 얻을 수 있게 의도적으로 문법 규칙을 적용
Kotlin의 null 안전성 특성 덕분에
Kotlin 컴파일러가 null을 허용하는 유형에 관해 null 검사를 강제하므로 이러한 런타임 오류가 방지

코드
fun main(){
    var favoriteActor: String? = null
    println(favoriteActor?.length)
}  */
/*
null이 아닌 어선셜 연산자 !! 사용
null이 아닌 !! 어설션 연산자를 사용하여 null을 허용하는 변수의 메서드나 속성에 액세스 가능

코드
fun main(){
    null이 확실하지 않다면 null이 아닌 !! 를 사용하지 않는 것이 좋다.
    var favoriteActor: String? = null
    println(favoriteActor!!.length) // 비정상 종료
}  */

/*
// ! if/else 조건문 사용
//!!if/else 조건문에서 if 브랜치를 사용하여 null 검사를 실행
//!!! null 검사는 != 비교연산자를 사용하여 허용하는 변수가 null과 같지 않은지 확인만 하면 된다.!!!
fun main(){
    var favoriteActor: String? = null
    if(favoriteActor != null){
        println("The number of characters in your favorite actor's name is ${favoriteActor.length}")
    } else {
        println("You didn't input a name.")
    }
}
 */

/*
// Null = 0 기본 값
fun main(){
    var favoriteActor: String? = null
    val lengthOfName = if(favoriteActor != null){
        favoriteActor.length
    } else {
        0
    }
    println("The number of characters in your favorite actor's name is $lengthOfName.")
}
 */

// ?: elvis 연산자 사용
// ?: Elvis 연산자는 ?. 안전 호출 연산자와 함께 사용할 수 있는 연산자
fun main(){
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName")

}