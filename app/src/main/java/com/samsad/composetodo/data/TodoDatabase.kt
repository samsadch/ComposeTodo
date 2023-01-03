package com.samsad.composetodo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.samsad.composetodo.data.models.TodoTask

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 03/01/2023
 */
@Database(entities = [TodoTask::class], version = 1, exportSchema = false)
abstract class TodoDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}