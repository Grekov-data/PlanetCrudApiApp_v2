package org.top.planetcrudapiapp_v2_java211.service;

import org.springframework.stereotype.Service;
import org.top.planetcrudapiapp_v2_java211.entity.Planet;

import java.util.Optional;

// контракт (интерфейс), описывающий операции, выполняемые с сущность Planet
@Service
public interface PlanetService {
    Iterable<Planet> getAll();              // получить все планеты
    Optional<Planet> getById(Integer id);   // получить планету по id
    Planet add(Planet planet);              // добавление новой планеты
}
