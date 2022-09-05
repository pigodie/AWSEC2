package com.example.aws.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
public class testController {

    @GetMapping
    String home(){
        return "esta es la pagina de inicio";
    }
}
