package cl.instituto.java;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Controlador {
    
    @GetMapping("/suma")
    public String sumaForm(Suma suma){
        return "suma-form";
    }
    
    @PostMapping("suma")
    public String sumaProcesar(@Valid Suma suma, BindingResult informeValidacion){
        if(informeValidacion.hasErrors()){
            return "suma-form";
        }
        return "resutado-suma";
    }
    
}

