package com.fullstack.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.model.Book;
import com.fullstack.repository.IUserRepository;

@Service
public class UserServiceImpl implements IUserService{
	@Autowired
	private IUserRepository userRepository;

	@Override
	public List<Book> getAll() {
		return userRepository.findAll();
	}
}
