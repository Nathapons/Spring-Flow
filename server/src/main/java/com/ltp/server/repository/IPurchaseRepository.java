package com.ltp.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.server.entity.Purchase;

public interface IPurchaseRepository extends CrudRepository<Purchase, Long>{
    
}
