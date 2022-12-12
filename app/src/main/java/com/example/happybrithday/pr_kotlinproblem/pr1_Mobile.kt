package com.example.happybrithday.pr_kotlinproblem

/*

---
문제
알림이 100개 미만인 경우 정확한 알림 수
99+: 알림이 100개를 넘는 경우 알림 수
---
결과
You have 51 notifications.
Your phone is blowing up! You have 99+ notifications.
---
알람: Notification
아침알람: moningNotification
이벤트 알람: eveningNotification
---
힌트: if| lse 문을 사용
알림: numberOfMessage < 100 미만으로 설정
출력: print 문에 ${} 변수 사용.
else 문으로 나머지 99+ 100개 넘는 알림 수를 출력

---
솔류션 코드 참고
noOfMessages ->  numberOfMessages 수정
 */


fun main() {
    val morningNotification = 51 // 아침 알람 51개
    val eveningNotification = 135 // 이벤트 알람 135개

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

// numberOfMessages : 메시지 수
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("You have ${numberOfMessages} notifications.")
    } else {
        println("Your phone is blowing up! You have 99+ notifications.")
    }
}