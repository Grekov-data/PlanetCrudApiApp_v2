package org.top.planetcrudapiapp_v2_java211.controller;

import org.springframework.web.bind.annotation.*;
import org.top.planetcrudapiapp_v2_java211.entity.Planet;
import org.top.planetcrudapiapp_v2_java211.service.PlanetService;

import java.util.Optional;

// контроллер, обеспечивающий выполнение запросов с планетами
@RestController
@RequestMapping("planet")
public class PlanetController {

    private final PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }

    // http://localhostL:8080/planet
    @GetMapping("")
    public Iterable<Planet> getAll() {
        return planetService.getAll();
    }

    // http://localhostL:8080/planet/{id}
    @GetMapping("{id}")
    public Optional<Planet> getById(@PathVariable Integer id) {
        return planetService.getById(id);
    }

    // http://localhostL:8080/planet
    @PostMapping("")
    public Planet add(@RequestBody Planet planet) {
        return planetService.add(planet);
    }
}
