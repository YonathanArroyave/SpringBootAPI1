package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")//Ruta 

public class HelloControler {

    @GetMapping //indica que es una peticion get
    public String helloWord(){
        return "Hola putitass";
    }
    
}
