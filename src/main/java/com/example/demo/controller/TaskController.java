package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Task;
import com.example.demo.service.TaskService;


@Controller
@RequestMapping("/tasks")
public class TaskController {

	@Autowired
	private TaskService service;
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	List<Task> listComplete = new ArrayList<>();
    List<Task> listUnComplete = new ArrayList<>();
	
	@GetMapping
	public String index(Model model) {
		List<Task> listTasks = service.listALlTask();
	    listComplete = new ArrayList<>();
	    listUnComplete = new ArrayList<>();
	    
	    for (Task task : listTasks) {
	    	if (task.getDelete_flg() == 0) {
	    		if (task.getComplete_flg() == 1 ) {
					
					listComplete.add(task);
				} else {
					listUnComplete.add(task);
				}
	    	}
		}
	
	    model.addAttribute("listTasksComplete", listComplete);
	    model.addAttribute("listTasksUnComplete", listUnComplete); 
		return "tasks/index";
	}
}
