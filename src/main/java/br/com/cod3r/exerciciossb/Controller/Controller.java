package br.com.cod3r.exerciciossb.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping(path = {"/ola", "/saudacao"})
    public String ola() {
        return "Olá Spring Boot";
    }

}
