package com.abhiwisesa.springbootmongodb.service;

import com.abhiwisesa.springbootmongodb.exception.TodoCollectionException;
import com.abhiwisesa.springbootmongodb.model.TodoDTO;

import javax.validation.ConstraintViolationException;
import java.util.List;

public interface TodoService {

    public void creteTodo(TodoDTO todo) throws TodoCollectionException;

    public List<TodoDTO> getAllTodos();

    public TodoDTO getSingleTodo(String id) throws TodoCollectionException;

    public void updateTodo(String id,TodoDTO todo) throws TodoCollectionException;

    public void deleteTodoById(String id) throws TodoCollectionException;

}
