package com.demoIntelligence.ppmtool.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoIntelligence.ppmtool.model.Todo;
import com.demoIntelligence.ppmtool.repository.TodoJpaRepository;

@Service
public class TodoHardcodedService {

	@Autowired
	TodoJpaRepository todoJpaRepo;

	public List<Todo> getAllTodos(String username) {

		List<Todo> getTodos = todoJpaRepo.findAllByUsername(username);

		System.out.println(getTodos);

		return getTodos;
	}

	public void addTodo(String username, Todo todo) {

		todoJpaRepo.save(todo);

	}

	public Todo getTodoByNameAndId(String username, long id) {

		Todo getTodos = todoJpaRepo.findByUsernameAndId(username, id);

		return getTodos;
	}

	public void deleteTodoById(long id) {
		todoJpaRepo.deleteById(id);
		
	}

	public void updateTodo(String username, long id, Todo todo) {
		
		Todo getTodos = todoJpaRepo.findByUsernameAndId(username, id);
		getTodos.setDescription(todo.getDescription());
		getTodos.setTargetDate(todo.getTargetDate());
		getTodos.setDone(todo.isDone());
		
		todoJpaRepo.save(getTodos);
		
	}

}
