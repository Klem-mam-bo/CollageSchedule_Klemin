package com.example.CollageSchedule_Klemin.data.dto

data class ScheduleByDateDto(
    val lessonDate: String = "",
    val weekday: String = "",
    val lessons: List<LessonDto> = emptyList()
)