package com.mk.spring.finalex.repository;

import com.mk.spring.finalex.model.Reservation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ReservationRepository extends MongoRepository<Reservation, String> {
}
