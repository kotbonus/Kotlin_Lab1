fun main() {
    println("Введите четырехзначное число:")
    val input = readLine()

    if (input != null && input.length == 4 && input.all { it.isDigit() }) {
        val digits = input.map { it.toString() }

        println("Результат: ${digits.joinToString(", ")}")
    } else {
        println("Ошибка: Введите корректное четырехзначное число.")
    }
}
