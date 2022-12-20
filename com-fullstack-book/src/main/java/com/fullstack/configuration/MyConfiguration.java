//package com.fullstack.configuration;
//
//import java.util.Collection;
//import java.util.Collections;
//
//import org.neo4j.driver.AuthTokens;
//import org.neo4j.driver.Driver;
//import org.neo4j.driver.GraphDatabase;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.neo4j.config.AbstractReactiveNeo4jConfig;
//import org.springframework.data.neo4j.repository.config.EnableReactiveNeo4jRepositories;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import com.fullstack.model.Book;
//
//@Configuration
//@EnableReactiveNeo4jRepositories
//@EnableTransactionManagement
//public class MyConfiguration extends AbstractReactiveNeo4jConfig{
//
//	@Bean
//    public Driver driver() {
//        return GraphDatabase.driver("bolt://localhost:7687", AuthTokens.basic("neo4j", "neo4j"));
//    }
//
//    @Override
//    protected Collection<String> getMappingBasePackages() {
//        return Collections.singletonList(Book.class.getPackage().getName());
//    }
//
//}
