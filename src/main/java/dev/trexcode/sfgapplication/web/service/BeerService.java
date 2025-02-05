package dev.trexcode.sfgapplication.web.service;

import dev.trexcode.sfgapplication.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID id);
}
