package com.example.demo.buch;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuchRepository extends ReactiveMongoRepository<Buch,String> {
}
