package com.api.microservicecc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class paginaInicial {

    @GetMapping("/")
    String	home() {
        return "Olá	Spring	Boot!!";
    }

}
