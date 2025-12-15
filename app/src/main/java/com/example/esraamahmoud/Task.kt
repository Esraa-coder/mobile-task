package com.example.esraamahmoud

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.vo.Entity

@Entity(tableName = "tasks")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val name: String,
    val isCompleted: Boolean = false
)