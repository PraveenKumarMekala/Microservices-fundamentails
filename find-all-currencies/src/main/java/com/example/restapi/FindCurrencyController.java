package com.example.restapi;

import com.example.domain.ConversionMultiple;
import com.example.repository.ConversionMultipleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FindCurrencyController {

    @Autowired
    public ConversionMultipleRepository repository;

    @GetMapping("/allCurrencies")
    public List<ConversionMultiple> getAllCurrencies() {
        return repository.findAll();
    }

    @GetMapping("/exchange-rate/from/{fromCurr}/to/{toCurr}")
    public ConversionMultiple getCurrency(@PathVariable("fromCurr") String fromCurr, @PathVariable("toCurr") String toCurr) {
        return repository.findByValueToAndValueFrom(toCurr, fromCurr);
    }
}
