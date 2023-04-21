fun main(args: Array<String>) {
    println("Hello World!")

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
}