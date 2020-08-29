package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Task;


public interface TaskRepository extends JpaRepository<Task, Integer>{

	@Query(value = "SELECT * FROM task AS t WHERE t.complete_flg = 0 and t.delete_flg=0", nativeQuery = true) 
    public List<Task> findListUnComplete();
	
	
	@Query(value = "SELECT * FROM task AS t WHERE t.complete_flg = 1 and t.delete_flg=0", nativeQuery = true) 
    public List<Task> findListCompleted();
}
