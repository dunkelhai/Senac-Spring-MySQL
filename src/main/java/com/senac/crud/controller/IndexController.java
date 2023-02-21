package com.senac.crud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {


    @GetMapping
    public String sayHello() {
        return "Crie novos requests de Notes usando um POST para o endpoint /api/notes .";
    }
}
