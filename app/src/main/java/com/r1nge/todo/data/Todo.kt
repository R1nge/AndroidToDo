package com.r1nge.todo.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Todo(
    val title: String,
    val description: String? = null,
    val isDone: Boolean,
    @PrimaryKey val id: Int? = null
)
