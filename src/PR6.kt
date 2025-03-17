fun main() {
    println("Введите ваше имя:")
    val name = readLine()
    println("Введите ваш возраст:")
    val ageInput = readLine()

    if (name != null && ageInput != null && ageInput.all { it.isDigit() }) {
        val age = ageInput.toInt()
        println("Привет, $name! Тебе уже $age")
    } else {
        println("Ошибка: Введите корректные данные.")
    }
}
