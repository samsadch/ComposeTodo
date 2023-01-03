package com.samsad.composetodo.data.repositories

import com.samsad.composetodo.data.TodoDao
import com.samsad.composetodo.data.models.TodoTask
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 03/01/2023
 */
class TodoRepository @Inject constructor(private val todoDao: TodoDao) {

    val getAllTasks: Flow<List<TodoTask>> = todoDao.getAllTasks()
    val sortByLow: Flow<List<TodoTask>> = todoDao.sortByLowPriority()
    val sortByHigh: Flow<List<TodoTask>> = todoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<TodoTask> {
        return todoDao.getSelectedTask(taskId)
    }

    suspend fun addTask(todoTask: TodoTask) {
        todoDao.addTask(todoTask)
    }

    suspend fun updateTask(todoTask: TodoTask) {
        todoDao.updateTask(todoTask)
    }

    suspend fun deleteTask(todoTask: TodoTask) {
        todoDao.deleteTask(todoTask = todoTask)
    }

    suspend fun deleteAllTask() {
        todoDao.deleteAllTasks()
    }

    fun searchDataBase(searchQuery: String): Flow<List<TodoTask>> {
        return todoDao.searchDatabase(query = searchQuery)
    }

}