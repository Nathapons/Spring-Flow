package com.ltp.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.server.entity.User;

public interface IUserRepository extends CrudRepository<User, Long>{

    
}