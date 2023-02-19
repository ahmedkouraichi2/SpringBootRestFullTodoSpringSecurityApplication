package com.example.demo.todo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class TodoService {
    @Autowired
    private TodoRepository todoRepository; 
    
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }
    
    
    public Todo getById(String id) {
      
            return todoRepository.findById(id).get();
        
    }
    
    public Todo save(Todo todo) {
      
        return todoRepository.save(todo);
    
    }
    
    public void delete(String id){
        todoRepository.deleteById(id);
     }
    
    
    
    
    
    
    
}
