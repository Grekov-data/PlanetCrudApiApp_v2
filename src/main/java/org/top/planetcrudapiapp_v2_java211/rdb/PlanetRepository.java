package org.top.planetcrudapiapp_v2_java211.rdb;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.top.planetcrudapiapp_v2_java211.entity.Planet;

@Repository
public interface PlanetRepository extends CrudRepository<Planet, Integer> {
}
