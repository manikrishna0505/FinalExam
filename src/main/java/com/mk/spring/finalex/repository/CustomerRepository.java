package com.mk.spring.finalex.repository;

import com.mk.spring.finalex.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
