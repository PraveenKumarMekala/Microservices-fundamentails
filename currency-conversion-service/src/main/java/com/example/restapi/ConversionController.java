package com.example.restapi;

import com.example.domain.ConversionMultiple;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ConversionController {

    @GetMapping("/conversion-value-dummy/from/{from}/to/{to}")
    public ConversionMultiple getValue(@PathVariable String from, @PathVariable String to) {
        return new ConversionMultiple(1, from, to, BigDecimal.ONE);
    }

    @GetMapping("/conversion-value-rest/from/{from}/to/{to}")
    public ConversionMultiple getValue_rest(@PathVariable String from, @PathVariable String to) {

        Map<String, String> uriVariable = new HashMap<>();
        uriVariable.put("fromCurr", from);
        uriVariable.put("toCurr", to);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ConversionMultiple> value = rest.getForEntity("http://localhost:9094/exchange-rate/from/{fromCurr}/to/{toCurr}",
                ConversionMultiple.class, uriVariable);
        return  value.getBody();
    }

    @GetMapping("/conversion-value-hys/from/{from}/to/{to}")
    public ConversionMultiple getValue_hys(@PathVariable String from, @PathVariable String to) {

        Map<String, String> uriVariable = new HashMap<>();
        uriVariable.put("fromCurr", from);
        uriVariable.put("toCurr", to);
        RestTemplate rest = new RestTemplate();
        ResponseEntity<ConversionMultiple> value = rest.getForEntity("http://localhost:9094/exchange-rate/from/{fromCurr}/to/{toCurr}",
                ConversionMultiple.class, uriVariable);
        return  value.getBody();
    }
}
