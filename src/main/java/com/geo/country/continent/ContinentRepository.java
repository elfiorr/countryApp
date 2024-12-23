package com.geo.country.continent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface ContinentRepository extends JpaRepository<ContinentModel, Long> {

    @Query("select c from ContinentModel c where nameOfContinent = :continent")
    List<ContinentModel> findByNameOfContinent(@RequestParam("continent") String continent);
}
