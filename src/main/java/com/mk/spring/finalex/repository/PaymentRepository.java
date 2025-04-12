package com.mk.spring.finalex.repository;

import com.mk.spring.finalex.model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
