package com.geo.country.continent;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.geo.country.EndpointsFactory.ALL;
import static com.geo.country.EndpointsFactory.API;
import static com.geo.country.EndpointsFactory.CONTINENTS;

@RestController
@RequestMapping(API + CONTINENTS)
@AllArgsConstructor
public class ContinentController {

    private final ContinentService continentService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(ALL)
    public List<ContinentModel> getAllContinents() {
        return continentService.findAll();
    }
}
