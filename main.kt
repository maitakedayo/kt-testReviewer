package main

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class CurrentClockIndicator {
    fun showCurrentTime() {
        val currentDateTime = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        val formattedTime = currentDateTime.format(formatter)
        println("Current time: $formattedTime")
    }

    companion object {
        @Suppress("unused")
        private fun toClockText(@Suppress("UNUSED_PARAMETER") timeInMillis: Long): String {
            TODO("Implement toClockText")
        }
    }
}

fun main() {
    val clockIndicator = CurrentClockIndicator()
    clockIndicator.showCurrentTime()
}
