package com.fullstack.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstack.model.Book;
import com.fullstack.service.UserServiceImpl;

@RestController
public class Controller {
	
	@Autowired
	private UserServiceImpl userServiceImpl;
	
	@GetMapping("/books")
	public List<Book>  getAll(){
		return userServiceImpl.getAll();
		
	}

}
