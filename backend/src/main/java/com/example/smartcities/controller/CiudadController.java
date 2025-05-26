package com.example.smartcities.controller;

import com.example.smartcities.model.Ciudad;
import com.example.smartcities.repository.CiudadRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api/ciudades")
@CrossOrigin(origins = "http://localhost:3000")
public class CiudadController {

    private final CiudadRepository ciudadRepository;

    public CiudadController(CiudadRepository ciudadRepository) {
        this.ciudadRepository = ciudadRepository;
    }

    @GetMapping
    public List<Ciudad> getAllCiudades() {
        return ciudadRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ciudad getCiudadById(@PathVariable Long id) {
        return ciudadRepository.findById(id).orElse(null);
    }

    @GetMapping("/{id}/kpis")
    public Map<String, Object> getKpisByCiudad(@PathVariable Long id) {
    Ciudad ciudad = ciudadRepository.findById(id).orElse(null);
    if (ciudad == null) return null;

    Map<String, Object> result = new HashMap<>();

    Map<String, Object> aire = Map.of(
        "estado", ciudad.getKpiAire().getEstado(),
        "valor", ciudad.getKpiAire().getValor()
    );
    Map<String, Object> transporte = Map.of(
        "estado", ciudad.getKpiTransporte().getEstado(),
        "valor", ciudad.getKpiTransporte().getValor()
    );
    Map<String, Object> agua = Map.of(
        "estado", ciudad.getKpiAgua().getEstado(),
        "valor", ciudad.getKpiAgua().getValor()
    );
    Map<String, Object> seguridad = Map.of(
        "estado", ciudad.getKpiSeguridad().getEstado(),
        "valor", ciudad.getKpiSeguridad().getValor()
    );
    Map<String, Object> salud = Map.of(
        "estado", ciudad.getKpiSalud().getEstado(),
        "valor", ciudad.getKpiSalud().getValor()
    );

    result.put("aire", aire);
    result.put("transporte", transporte);
    result.put("agua", agua);
    result.put("seguridad", seguridad);
    result.put("salud", salud);

    return result;
}

    @GetMapping("/nombre/{nombre}")
    public Ciudad getCiudadByNombre(@PathVariable String nombre) {
        return ciudadRepository.findByNombre(nombre).orElse(null);
    }


}
