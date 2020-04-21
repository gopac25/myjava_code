package com.postgres.myproject;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findBYName(String name);

}