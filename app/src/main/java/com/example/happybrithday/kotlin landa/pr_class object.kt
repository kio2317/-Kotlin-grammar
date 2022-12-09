package com.example.happybrithday



/*
class 규칙
클래스 이름을 자유롭게 선택할 수 있지만
fun 키워드와 같은 Kotlin 키워드를 클래스 이름 X
---
클래스 이름은 PascalCase로 작성이 된다.
각 단어는 대문자로 시작하며 단어 사이에 공백이 없습니다.
ex) SmartDevice에서 각 단어의 첫 글자가 대문자이고 단어 사이에 공백이 없습니다.
---
클래스 3가지 속성
속성. 클래스 객체의 속성을 지정하는 변수
메서드. 클래스의 동작과 작업이 포함된 함수
생성자. 클래스가 정의된 프로그램 전체에서 클래스의 인스턴스를 만드는 특수 멤버 함수.
---
클래스 속성 정의
이름: 기기 이름
카테고: 스마트 기기의 유형입니다(예: 엔터테인먼트, 유틸리티, 요리)
기기 상태. 켜기, 끄기, 온라인, 오프라인과 같은 기기의 상태입니다.
기기가 인터넷에 연결되어 있으면 온라인 상태로, 그렇지 않으면 오프라인으로 간주됩니다.
---
속성의 getter 함수와 setter 함수이 있다.
Kotlin 속성은 지원 필드를 사용하여 메모리에 값을 보유
지원 필드는 기본적으로 속성에 내부적으로 정의된 클래스 변수
지원 필드는 범위가 속성으로 지정되므로 get() 속성 함수나 set() 속성 함수를 통해서만 액세스
---
기본 생성자
class SmartDevice constructor() {
    ...
}
공개 상태 수정자가 없는 경우 constructor 키워드를 삭제할 수 있다.
class SmartDevice{
    ...
}
매개변수화된 생성자 정의
SmartDevice 클래스에서 name 속성과 category 속성은 변경할 수 없다.
SmartDevice 클래스의 모든 인스턴스가 name 속성과 category 속성을 초기화하도록 해야 합니다.
현재 구현에서 name 및 category 속성의 값은 하드코딩됩니다.
즉, 모든 스마트 기기는 "Android TV" 문자열로 이름이 지정되며 "Entertainment" 문자열로 분류
불변성은 유지하되 하드코딩된 값을 피하려면 매개변수화된 생성자를 사용하여 초기화

SmartDevice 클래스에서 기본값을 할당하지 않고 name 속성과 category 속성을 생성자로 이동

kotlin 생성자 두 가지 유형 (기본 생성자 보조 생성자)
기본 생성자: 클래스에는 클래스 헤더의 일부로 정의된 기본 생성자가 하나만 있을 수 있습니다.
보조 생성자: 한 클래스에 여러 보조 생성자가 있을 수 있습니다. 매개변수를 포함하거나 포함하지 않고 보조 생성자를 정의

보조 생성자는 클래스를 본문에 ㅍ ㅗ함되고 이 생성자의 문법은 세 부분으로 구성
보조 생성자 선언: 보조 생성자 정의는 constructor 키워드로 시작하고 그 뒤에 괄호가 나옵니다. 해당하는 경우 괄호에는 보조 생성자에 필요한 매개변수가 포함됩니다.
기본 생성자 초기화: 초기화는 콜론으로 시작하고 그 뒤에 this 키워드와 괄호 쌍이 나옵니다. 해당하는 경우 괄호에는 기본 생성자에 필요한 매개변수가 포함됩니다.
보조 생성자 본문: 기본 생성자 초기화 뒤에 중괄호 쌍이 나오며 이 중괄호에는 보조 생성자의 본문이 포함됩니다.
 */




// 클래스 정의
//매개변수화된 생성자 정의

class smartDevice(val name: String, val category: String) {
    // 클래스 속성 정의
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode:Int ): this(name, category){
        deviceStatus = when (statusCode){
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }

    // 클래스 속성 정의2 (스피커 볼륨)
    // 백그라운드에서 컴파일러가 추가하므로 코드에 표시되지 않습니다
    var speakerVolume = 2
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }


    // 메서드 정의
    fun turnOn(){
        println("Smart device is turned on.")
    }
    fun turnOff(){
        println("Smart device is turned Off.")
    }
}


//class 인스턴스 만들기
var number : Int = 1
fun main(){
    val smartTvDevice = smartDevice("Android TV", "Entertainment")
    println("Device name is: ${smartTvDevice.name}")
    smartTvDevice.turnOn()
    smartTvDevice.turnOff()
}