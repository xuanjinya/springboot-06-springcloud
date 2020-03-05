package com.example.consumeruser.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    RestTemplate RestTemplate;

    @GetMapping("/buy")
    public String buyTicket(String name) {
        RestTemplate.getForObject("http://PROVIDER-TICKET/ticket", String.class);
        return name + "购买了" + "";
    }

}

