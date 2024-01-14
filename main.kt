package main

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter

class CurrentClockIndicator {
    fun showCurrentTime() {
        val currentTimeInMillis = System.currentTimeMillis()
        val clockText = toClockText(currentTimeInMillis)
        println("Current Time: $clockText")
    }

    companion object {
        private fun toClockText(timeInMillis: Long): String {
            val instant = Instant.ofEpochMilli(timeInMillis)
            val zoneId = ZoneId.systemDefault()
            val localDateTime = LocalDateTime.ofInstant(instant, zoneId)
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
            return localDateTime.format(formatter)
        }
    }
}

fun main() {
    val clockIndicator = CurrentClockIndicator()
    clockIndicator.showCurrentTime()
}
