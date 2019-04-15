package `in`.abaddon.cerberus.models

data class Reading(
    val day: Long,
    val discipline: Discipline?,
    val value: Double,
    val remark: String
)