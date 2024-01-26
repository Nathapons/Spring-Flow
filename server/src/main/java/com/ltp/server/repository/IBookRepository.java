package com.ltp.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.server.entity.Book;

public interface IBookRepository extends CrudRepository<Book, Long>{
    
}
