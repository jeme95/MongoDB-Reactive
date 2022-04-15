package com.example.demo.buch;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/buecher")
public class BuchController {
    BuchService buchService;

    public BuchController(BuchService buchService) {
        this.buchService = buchService;
    }

    @GetMapping
    ResponseEntity<Flux> getAll() {
        return ResponseEntity.ok(buchService.getAll());
    }

}
