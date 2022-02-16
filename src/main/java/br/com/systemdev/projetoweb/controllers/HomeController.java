package br.com.systemdev.projetoweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //identifica classe Controller
@RequestMapping //Mapeamento de qual rota vai responder
public class HomeController {
    
    @GetMapping //inform que a action vai ser executada quando receber requisição com get
    public String home(){
        return "home";
    }

}
