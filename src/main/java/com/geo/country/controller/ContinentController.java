package com.geo.country.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.geo.country.EndpointsFactory.ALL;
import static com.geo.country.EndpointsFactory.API;
import static com.geo.country.EndpointsFactory.CONTINENTS;

@RestController
@RequestMapping(API+CONTINENTS)
public class ContinentController {

    @GetMapping(ALL)
    public String getAllContinents(){
        return "all";
    }
}
