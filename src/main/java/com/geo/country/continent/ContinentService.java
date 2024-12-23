package com.geo.country.continent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContinentService {

    private final ContinentRepository continentRepository;

    public List<ContinentModel> findAll() {
        return continentRepository.findAll();
    }
}
