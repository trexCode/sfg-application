package dev.trexcode.sfgapplication.web.service;

import dev.trexcode.sfgapplication.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);
}
