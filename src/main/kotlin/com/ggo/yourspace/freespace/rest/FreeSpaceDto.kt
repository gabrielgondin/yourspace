package com.ggo.yourspace.freespace.rest

import java.time.LocalDate

data class FreeSpaceDto(val id: Long, val seats: Int, val dateBegin: LocalDate, val dateEnd: LocalDate) {
    val room = false;
}