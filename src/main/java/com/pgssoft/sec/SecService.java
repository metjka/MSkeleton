package com.pgssoft.sec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by isalnikov on 10/4/2016.
 * Time 12:34 PM
 * MSkeleton
 */
@SpringBootApplication
public class SecService {

    public static void main(String[] args) {
        System.setProperty("spring.config.name", "sec-server");

        SpringApplication.run(SecService.class, args);
    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
