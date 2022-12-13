package com.example.happybrithday.pr_kotlinproblem

/*

---
주제:
초기 코드에서는 null을 허용하는 Bid? 유형을 인수로 허용하는 auctionPrice() 함수가 제공
---
경매에서는 일반적으로 가장 높은 가격을 제시하는 입찰자가 상품 가격을 결정합니다
이 특별 경매에서는 상품의 입찰자가 없는 경우
상품이 자동으로 최소 가격에 경매 회사에 판매됩니다.
---
문제
프로그램이 다음 줄을 출력하도록 auctionPrice() 함수를 완료합니다.
---
결과
Item A is sold at 5000.
Item B is sold at 3000.
---
솔류션 코드
안전 호출과 ?. Elvis 연산자를 사용하여 정확한 가격을 반환한다?...
 */



fun main() {
    val winningBid = Bid(5000, "Private Collector")

    println("Item A is sold at ${auctionPrice(winningBid, 2000)}.")
    println("Item B is sold at ${auctionPrice(null, 3000)}.")
}

class Bid(val amount: Int, val bidder: String)

fun auctionPrice(bid: Bid?, minimumPrice: Int): Int {
    return bid?.amount ?: minimumPrice

}