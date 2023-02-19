package com.example.demo.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/todos")
public class TodoController{

    @Autowired
    private TodoService todoService;
    
    
    @GetMapping(value = {"", "/"})
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> result =  todoService.findAll() ;
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
    
    
    @GetMapping(value ="/{id}")
    
    public ResponseEntity<Todo> getTodoById(@PathVariable String id){
    	Todo result = todoService.getById(id);
        return new ResponseEntity<>(result,HttpStatus.OK);
        
        
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String id) {

        todoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    @PostMapping(value = {"", "/"})
    public ResponseEntity<Todo> createNewTodo( @RequestBody Todo todo) {
       // todo.setUserId(getCurrentUser().getId());
        Todo result = todoService.save(todo);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }
    
    
    
    
    


}