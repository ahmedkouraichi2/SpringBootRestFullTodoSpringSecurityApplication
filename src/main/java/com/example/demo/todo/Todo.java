package com.example.demo.todo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
	
	
    private String title;
    private String description;
    private long timestamp ;



   

    public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public Todo(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        
    }
	
	
	public Todo()
	    {
		this.timestamp = System.currentTimeMillis();
		}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

  

   

   
}