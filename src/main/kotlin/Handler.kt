
fun validateScore(score: Int) {
    if (score !in 0..100) {
        throw java.lang.IllegalArgumentException("score의 범위는 0부터 100입니다.");
    }
}

/*
Java에서 if-else는 Statement
Kotlin에서는 Expression
 */
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        return "P";
    } else {
        return "F";
    }
}

fun getGrade(score: Int): String {
    return if (score > 90) {
         "A"
    } else if (score >= 80) {
         "B"
    } else if (score >= 70) {
         "D"
    } else {
        "E"
    }
}