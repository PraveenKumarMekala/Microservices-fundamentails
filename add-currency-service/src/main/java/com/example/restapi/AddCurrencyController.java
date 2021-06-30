package com.example.restapi;

import com.example.domain.ConversionMultiple;
import com.example.repository.ConversionMultipleRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddCurrencyController {

    private ConversionMultipleRepository repository;

    public AddCurrencyController(ConversionMultipleRepository repository) {
        this.repository = repository;
    }

    @PostMapping(value = "/currencies", consumes = "application/json", produces = "application/json")
    public ConversionMultiple addToData(@RequestBody ConversionMultiple conversionMultiple) {
        return repository.save(conversionMultiple);
    }
}
