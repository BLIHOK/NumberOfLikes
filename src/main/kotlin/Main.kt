fun main(args: Array<String>) {
    println("Введите число лайков")

    val likes = readln().toInt()
    val ending = when {
        likes == 1 -> "человеку"
        likes % 11 in 0..1 -> "людям"
        likes % 10 == 1 -> "человеку"
        else -> "людям"
    }
    println(
        """
        Понравилось $likes $ending
    """.trimIndent()
    )
}
