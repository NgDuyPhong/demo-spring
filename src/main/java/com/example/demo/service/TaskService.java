package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;


@Service
@Transactional
public class TaskService {

	@Autowired
	private TaskRepository repo;
	
	public List<Task> listALlTask() {
		return repo.findAll();
	}
	
	public void save(Task task) {
		repo.save(task);
	}
	
	public Task get(Integer id) {
		return repo.findById(id).get();
	}
	
	public void delete(Integer id) {
		repo.deleteById(id);;
	}
	
	public List<Task> getListUncomplete() {
		return repo.findListUnComplete();
	}
	
	public List<Task> getListcompleted() {
		return repo.findListCompleted();
	}
}
