package com.example.demo.buch;

import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BuchService {
    BuchRepository buchRepository;

    public BuchService(BuchRepository buchRepository) {
        this.buchRepository = buchRepository;
    }

    public Flux<Buch> getAll() {
        return buchRepository.findAll();
    }

}
