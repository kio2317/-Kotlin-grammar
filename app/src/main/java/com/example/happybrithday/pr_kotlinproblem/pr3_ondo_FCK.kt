package com.example.happybrithday.pr_kotlinproblem


/*
---
주제:  온도를 한 체계에서 다른 체계로 변환하는 프로그램을 작성
---
문제
섭씨에서 화씨로: F = 9/5(°C) + 32
켈빈에서 섭씨로: °C = K - 273.15
화씨에서 켈빈으로: K = 5/9(°F - 32) + 273.15
String.format("%.2f", /* measurement */ ) 메서드는
소수점 이하 두 자리로 숫자를 String 유형으로 변환하는 데 사용됩니다.
---
결과
27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin.
---
온도 변환에 대해 이해가 없어 계산식 부족
솔류션코드 참고
함수를 printFinalTemperature() 함수에 매개변수로 전달해야 합니다.
가장 간결한 솔루션은 람다 표현식을 인수로 전달하고, 매개변수 이름 대신 it 매개변수 참조를 사용하고, 후행 람다 문법을 활용
 */


fun main() {
    printFinalTemperature(27.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32}
    printFinalTemperature(350.0, "Kelvin", "Celsius") {it - 273.15}
    printFinalTemperature(10.0, "Fahrenhelit","Kelvin"){ 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(initialMeasurement: Double,
                          initialUnit: String,
                          finalUnit: String,
                          conversionFormula: (Double) -> Double
) {
    //String.format("%.2f", /* measurement */ )
    //메서드는 소수점 이하 두 자리로 숫자를 String 유형으로 변환하는 데 사용
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}