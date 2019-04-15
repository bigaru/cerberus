package `in`.abaddon.cerberus.models

data class Discipline(
    val name: String,
    val minimumInterval: Int,
    val level: Int,
    val intervalCounter: Int,
    val reward: String,
    val lastUpdate: Long,
    val format: String
)