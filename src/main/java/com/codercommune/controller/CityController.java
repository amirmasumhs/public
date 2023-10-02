package com.codercommune.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class CityController {

    @GetMapping("/cities")
    public List<Object> getCity() {
        String uri="https://newsapi.org/v2/top-headlines?category=business&country=id&apiKey=860b825986c2418989c2f0621880623b";
        RestTemplate template=new RestTemplate();
        Object[] objects=new Object[]{template.getForObject(uri, Object.class)};
        return Arrays.asList(objects);
    }
}
