package Lovalace.UDEA.Empresa3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/empresa")
public class Controller {

    @GetMapping
    public String creaEmpresa() {
        return  "Empresa";
    }
    @GetMapping("/nueva/empresa")
        public String nuevaEmpresa(){
       return "Haz creado empresa";
    }

}
