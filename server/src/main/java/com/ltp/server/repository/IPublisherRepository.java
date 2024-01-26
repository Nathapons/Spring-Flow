package com.ltp.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.server.entity.Publisher;

public interface IPublisherRepository extends CrudRepository<Publisher, Long> {
    
}
