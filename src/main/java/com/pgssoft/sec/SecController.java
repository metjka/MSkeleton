package com.pgssoft.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by isalnikov on 10/4/2016.
 * Time 12:51 PM
 * MSkeleton
 */
@RestController
public class SecController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/sup")
    public String sup() {
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8088/", String.class);
        String body = forEntity.getBody();
        String concat = "sup ".concat(body);
        return concat;
    }



}
