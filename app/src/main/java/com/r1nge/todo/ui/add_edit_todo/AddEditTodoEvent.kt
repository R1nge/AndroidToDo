package com.r1nge.todo.ui.add_edit_todo

sealed class AddEditTodoEvent {
    data class OnTitleChange(val title: String): AddEditTodoEvent()
    data class OnDescriptionChanged(val description: String): AddEditTodoEvent()
    object OnSaveTodoClick: AddEditTodoEvent()
}