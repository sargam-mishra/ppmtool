package com.demoIntelligence.ppmtool.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demoIntelligence.ppmtool.model.Todo;
import com.demoIntelligence.ppmtool.service.TodoHardcodedService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TodoJpaResource {

	@Autowired
	private TodoHardcodedService todoService;

	@PostMapping("/users/{username}/addTodo")
	@CrossOrigin(origins = "http://localhost:3000") 
	public ResponseEntity<Void> addTodo(@PathVariable String username, @RequestBody Todo todo) {
		todoService.addTodo(username, todo);

		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	@PutMapping("/users/{username}/updateTodo/{id}")
	public ResponseEntity<Void> updateTodo(@PathVariable String username, @PathVariable long id, @RequestBody Todo todo){
		todoService.updateTodo(username, id, todo);
		
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	

	@GetMapping("/users/{username}/todos")
	public List<Todo> getAllTodos(@PathVariable String username) {

		List<Todo> getAllTodos = todoService.getAllTodos(username);
		return getAllTodos;

	}

	@GetMapping("/users/{username}/todos/{id}")
	public Todo getTodo(@PathVariable String username, @PathVariable long id) {

		Todo getTodo = todoService.getTodoByNameAndId(username, id);
		return getTodo;

	}

	// DELETE /users/{username}/todos/{id}

	@DeleteMapping("/users/{username}/todos/{id}")
	public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id) {
		
		 todoService.deleteTodoById(id);
		 
		 return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
