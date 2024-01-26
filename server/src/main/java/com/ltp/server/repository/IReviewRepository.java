package com.ltp.server.repository;

import org.springframework.data.repository.CrudRepository;

import com.ltp.server.entity.Review;

public interface IReviewRepository extends CrudRepository<Review, Long>{
    
}
