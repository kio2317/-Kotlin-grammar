package com.example.happybrithday.pr_kotlinproblem




/*

---
주제:  사용자 프로필 세부정보를 출력하는 프로그램을 작성
---
필수, 비필수 입력란이 포함된 온라인 웹사이트 프로필을 작성해야 하는 경우가 많습니다.
예를 들어 개인 정보를 추가하고 프로필에 등록하도록 추천한 다른 사용자와 연결할 수 있습니다.
---
문제
프로그램이 다음 줄을 출력하도록 showProfile() 함수를 완료합니다.
---
결과
Name: Amanda
Age: 33
Likes to play tennis. Doesn't have a referrer.

Name: Atiqah
Age: 28
Likes to climb. Has a referrer named Amanda, who likes to play tennis.
---
솔류션 코드
이 솔루션에는 다양한 클래스 속성이 null인지 여부에 따라
서로 다른 텍스트를 출력하도록 다양한 if/else 문에 null 검사가 포함
atiqah climb취미도 같이 나와야 되는게 아닌가하는 의문점을 가져본다.
솔류션 코드보니 생각하지도 못했네요.
*/

fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)

    amanda.showProfile()
    atiqah.showProfile()
}

class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
        println("Attributes.Name:$name")
        println("Age : $age")

        if (referrer != null){
            print("Has a referrer named ${referrer.name}")
            if (referrer.hobby != null) {
                print(", who likes to ${referrer.hobby}")
            } else{
                print(".")
            }
        } else{
            print("Dosen't have a referrer")
        }
        print("\n\n")

    }
}
