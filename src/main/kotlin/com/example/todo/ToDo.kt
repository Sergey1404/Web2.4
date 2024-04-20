package org.example.com.example.todo

import com.example.todo.Status
import com.example.todo.ToDoItem
import java.time.LocalDate

class ToDo {
    private val toDoList = mutableListOf<ToDoItem>()

    fun addTask(task: ToDoItem) {
        toDoList.add(task)
    }

    fun listOutPut(): List<ToDoItem> = toDoList
    fun getTaskByDescription(description: String): ToDoItem? {
        return toDoList.find { it.description == description || it.subtasks.any { subtask -> subtask.description == description } }
    }

    fun updateTask(id: Int, newDescription: String, newStatus: Status, newDate: LocalDate, newAdditionalInfo: String): Boolean {
            val task = toDoList.find { it.id == id }
            if (task != null) {
                task.description = newDescription
                task.status = newStatus
                task.date = newDate
                task.additionalInfo = newAdditionalInfo
                    return true
            }
        return false
    }

    fun removeTaskById(id: Int): Boolean {
        val task = toDoList.find { it.id == id }
        return if (task != null) {
            toDoList.remove(task)
            true
        } else {
            false
        }
    }

    fun getTaskById(id: Int): ToDoItem? {
        return toDoList.find { it.id == id }
    }
}