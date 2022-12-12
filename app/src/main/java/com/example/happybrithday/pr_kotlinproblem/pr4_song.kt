package com.example.happybrithday.pr_kotlinproblem




/*

---
주제: 음악 플레이어 앱을 만들어야 한다고 가정
---
노래의 구조를 나타낼 수 있는 클래스를 만듭니다.
Song 클래스에 다음 코드 요소를 포함해야 합니다.
---
문제
제목, 아티스트, 발표 연도, 재생 횟수의 속성
노래가 인기 있는지 나타내는 속성. 재생 횟수가 1,000회 미만이면 인기가 없다고 간주합니다.
다음 형식으로 노래 설명을 출력하는 메서드:
---
결과
'[제목], 연주한 [아티스트], 출시한 [발표 연도]'

 */

fun main(){
    val brunSong = Song("We Don't Talk About Brunpo","Encanto Cast", 2022, 1_000_000)
    brunSong.printDescription()
    println(brunSong.isPopular)

}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
) {
    val isPopular: Boolean
    get() = playCount >= 1000

    fun printDescription(){
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}