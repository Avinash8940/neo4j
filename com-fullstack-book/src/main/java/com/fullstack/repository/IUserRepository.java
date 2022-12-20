package com.fullstack.repository;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import com.fullstack.model.Book;

public interface IUserRepository extends Neo4jRepository<Book, Integer>{
	
//	@Query("match (n:Book) return n")
//	List<Book> getAllBooks();
}
