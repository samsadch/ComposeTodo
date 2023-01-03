package com.samsad.composetodo.data.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.samsad.composetodo.util.Constants.DATABASE_TABLE

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 03/01/2023
 */
@Entity(tableName = DATABASE_TABLE)
data class TodoTask(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val title: String,
    val description: String,
    val priority: Priority
)
