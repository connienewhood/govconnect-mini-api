package com.govconnect.demo.controller;

import com.govconnect.demo.model.Resident;
import com.govconnect.demo.repository.ResidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ResidentController {

    @Autowired
    private ResidentRepository repository;

    @GetMapping("/renewals")
    public List<Resident> getRenewals() {
        return repository.findByIsPaidFalse();
    }

    @PostMapping("/payment/{id}")
    public ResponseEntity<String> pay(@PathVariable Long id) {
        Resident r = repository.findById(id).orElse(null);
        if (r == null) return ResponseEntity.notFound().build();

        r.setIsPaid(true);
        repository.save(r);
        return ResponseEntity.ok("Payment processed for " + r.getName());
    }
}
