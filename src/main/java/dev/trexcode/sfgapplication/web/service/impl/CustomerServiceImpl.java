package dev.trexcode.sfgapplication.web.service.impl;

import dev.trexcode.sfgapplication.web.model.CustomerDto;
import dev.trexcode.sfgapplication.web.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Grupo Modelo")
                .build();
    }
}
