package com.ggo.yourspace.freespace.rest

import com.ggo.yourspace.freespace.FreeSpaceService
import com.ggo.yourspace.freespace.Space
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/freespaces")
class FreeSpaceRest {
    @Autowired
    private lateinit var freeSpaceService: FreeSpaceService

    @GetMapping
    fun freeSpace(): List<FreeSpaceDto> {

        return freeSpaceService.getAvailableFreeSpaces()
    }
}