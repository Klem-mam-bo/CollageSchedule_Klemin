package com.example.CollageSchedule_Klemin.data.repository
import com.example.CollageSchedule_Klemin.data.api.ScheduleApi
import com.example.CollageSchedule_Klemin.data.dto.ScheduleByDateDto
class ScheduleRepository(private val api: ScheduleApi) {
    suspend fun loadSchedule(group: String): List<ScheduleByDateDto> {
        return api.getSchedule(
            groupName = group,
            start = "2026-03-16",
            end = "2026-03-25"
        )
    }
}