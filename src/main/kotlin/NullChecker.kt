fun main() {
    val str: String? = "ABC"
    println(str?.length ?: 0); //null이면 x, null이 아니면 o -> safe call
    //null이면 0 으로 처리

    println(startsWith(null)); //npe

    //코틀린에서 자바 코드를 가지고 올 수 있다.
}


// Kotlin에서는 null이 가능한 타입을 완전히 다르게 취급한다.
fun startsWithA1(str:String?): Boolean {
    /**
     * AS IS
     */
    if (str == null) {
        throw java.lang.IllegalArgumentException("null이 들어왔습니다.")
    }

    /**
     *
     * TO BE
     * 전체가 null이 된다.
     */
    str?.startsWith("A")
        ?: throw java.lang.IllegalArgumentException("null이 들어왔습니다.");

    return str.startsWith("A");
}

fun startsWithA2(str:String?) : Boolean? {
    /**
     * AS - IS
     */
    if (str == null) {
        return null;
    }
    /**
     * TO -BE
     */
    return str?.startsWith("A"); //str이 null이면 전체 코드가 null이 된다.

    return str.startsWith("A");
}

fun startsWithA3(str:String?) : Boolean {
    /**
     * AS - IS
     */
    if (str == null) {
        return false
    }

    /**
     * TO - BE
     * null이 아니면 "A", null이면 false
     */
    return str?.startsWith("A") ?: false;
    return str.startsWith("A");
}

//이 str은 절대 null이 아니야!
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A");
}