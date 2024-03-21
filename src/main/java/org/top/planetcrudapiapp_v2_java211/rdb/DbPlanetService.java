package org.top.planetcrudapiapp_v2_java211.rdb;

import org.springframework.stereotype.Service;
import org.top.planetcrudapiapp_v2_java211.entity.Planet;
import org.top.planetcrudapiapp_v2_java211.service.PlanetService;

import java.util.Optional;

// имплементация PlanetService, реализующая операции с реляционной БД
@Service
public class DbPlanetService implements PlanetService {

    private final PlanetRepository planetRepository;

    public DbPlanetService(PlanetRepository planetRepository) {
        this.planetRepository = planetRepository;
    }

    @Override
    public Iterable<Planet> getAll() {
        return planetRepository.findAll();
    }

    @Override
    public Optional<Planet> getById(Integer id) {
        return planetRepository.findById(id);
    }

    @Override
    public Planet add(Planet planet) {
        return planetRepository.save(planet);
    }
}
