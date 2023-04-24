fun main() {

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    //compareTo 호출
    if (money1 > money2) {
        println("Money1이 Money2보다 금액이 큽니다.");
    }

    /**
     *
     * 동등성 : 두 객체의 값이 같은가 -> equals -> ==
     * 동일성 : == (주소, 자바) -> === (코틀린)
     */

    val money3 = JavaMoney(1_000L)
    val money5 = money3
    val money6 = JavaMoney(3_000L)

    //주소가 같은지
    println(money3 === money5)
    //값이 같은지
    println(money3 == money5)

}