package com.example.smartcities.controller;

import com.example.smartcities.model.KpiStatus;
import com.example.smartcities.repository.KpiRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/kpis")
public class KpiController {

    @Autowired
    private KpiRepository repo;

    @GetMapping
    public List<KpiStatus> getAll() {
        return repo.findAll();
    }

    @GetMapping("/{tipo}")
    public List<KpiStatus> getByTipo(@PathVariable String tipo) {
        return repo.findByTipo(tipo);
    }
}
