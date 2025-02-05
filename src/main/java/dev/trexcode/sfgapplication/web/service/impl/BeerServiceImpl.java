package dev.trexcode.sfgapplication.web.service.impl;

import dev.trexcode.sfgapplication.web.model.BeerDto;
import dev.trexcode.sfgapplication.web.service.BeerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID id) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Negra Modelo")
                .beerStyle("Black Beer")
                .build();
    }
}
