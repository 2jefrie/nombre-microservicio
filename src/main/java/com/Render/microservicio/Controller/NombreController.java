package com.Render.microservicio.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NombreController {
    @GetMapping("/nombre")
    public String enviarNombre() {
        return "Jefrye Choxom";
    }
}
