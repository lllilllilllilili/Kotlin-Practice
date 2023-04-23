fun main(args: Array<String>) {
    println("Hello World!")
    //코틀린에서는 null을 진짜 싫어하는구나..
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    /**
     * long number1 = 10L;
     * final long number2 = 10L
     *
     * Long number3 = 1_000L;
     * Person person = new Person("inguu");
     */
    var number1 = 10L;
    number1 = 5L;

    //final 같은 역할을 한다.
    val number2 = 10L
//    number2 = 5L;

    //1. val -> 꼭 필요한 경우에 대해서 var로 만든다.

    //상황에 따라서 내부적으로 Primitive 로 바꿔서 알아서 처리해준다.
    var test1 = 10L;
    var test2 = 1_00L;

    var number3 : Long? = 10L // 내부적으로 알아서 바꿔준다.
    number3 = null; //null이 들어갈 수 없게 설계 : Long? 이렇게 써야 한다. 
    
    //TODO(inguu): 메모, 프로그래머가 boxing / unboxing 을 고려하지 않아도 되도록 Kotlin이 알아서 처리해준다. 
    
    
    var person = Person("inguu") //new를 안붙여도 객체를 생성할 수 있다.
    //var : 변경 가능하다. val : 변경 불가능하다. (read-only)
    //타입을 명시적을 작성하지 않아도 타입이 추론된다.
}

//TODO(inguu) : 코틀린에서 변수와 타입, 연산자를 다루는 방법
/**
 * Sub Mission : 계산기 하나 만들어보자.
 */

