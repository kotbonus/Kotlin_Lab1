fun main() {
    val totalDays = 2642
    val years = totalDays / 365
    val remainingDaysAfterYears = totalDays % 365
    val weeks = remainingDaysAfterYears / 7
    val days = remainingDaysAfterYears % 7

    println("Лет: $years, недель: $weeks, дней: $days")
}
