fun main(args: Array<String>) {
    println("Введите число лайков")
    val likes = readln().toInt()
    val ending = if (likes % 2 == 0) "людям" else "человеку"

    println("""
        Понравилось $likes $ending
    """.trimIndent())
}