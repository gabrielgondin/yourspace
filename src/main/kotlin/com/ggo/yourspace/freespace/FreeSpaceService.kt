package com.ggo.yourspace.freespace

import com.ggo.yourspace.freespace.rest.FreeSpaceDto
import org.springframework.stereotype.Component

@Component
class FreeSpaceService {

    fun getAvailableFreeSpaces(): List<FreeSpaceDto> {
        return ArrayList()
    }
}