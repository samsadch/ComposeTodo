package com.samsad.composetodo.di

import android.content.Context
import androidx.room.Room
import com.samsad.composetodo.data.TodoDatabase
import com.samsad.composetodo.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * @Author: Samsad Chalil Valappil
 * @Date: 03/01/2023
 */
@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Singleton
    @Provides
    fun provideDataBase(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, TodoDatabase::class.java, DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideDao(database: TodoDatabase) = database.todoDao()
}