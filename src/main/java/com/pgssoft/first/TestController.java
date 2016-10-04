package com.pgssoft.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by isalnikov on 10/4/2016.
 * Time 11:10 AM
 * MSkeleton
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String hello(){
        return "test";
    }

}
