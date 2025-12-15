package com.example.esraamahmoud

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.vo.Database

@Database(entities = [Task::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao

}
