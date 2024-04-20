package com.example.todo

import org.example.com.example.todo.ToDo
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ToDoConfig {

    @Bean
    fun toDo(): ToDo {
        return ToDo()
    }
}