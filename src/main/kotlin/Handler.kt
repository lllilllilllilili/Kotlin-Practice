
fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw java.lang.IllegalArgumentException("${score}는 0보다 작을 수 없습니다.");
    }
}

/*
Java에서 if-else는 Statement
Kotlin에서는 Expression
 */
fun getPassOrFail(score: Int): String {
    if (score >= 50) {
        return "P";
    } else {
        return "F";
    }
}