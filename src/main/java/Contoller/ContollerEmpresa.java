package Contoller;

import Lovalace.UDEA.Empresa3.Empresa3Application;
import Repository.RepositoryEmpresa;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.nio.file.Path;
import java.util.List;


@RestController
@RequestMapping("/empresa")
public class ContollerEmpresa {
    @Autowired
    private RepositoryEmpresa repositoryEmpresa;
    @GetMapping
    public List<Empresa3Application> obtenerEmpresa(){
        return repositoryEmpresa.findAll();
    }
    @PostMapping
    public Empresa3Application crearEmpresa(@RequestBody Empresa3Application empresa){
        return repositoryEmpresa.save(empresa);

    }
    @PutMapping
    public Empresa3Application actualizaeEmpresa(@RequestBody Empresa3Application empresa) {
        return repositoryEmpresa.save(empresa);
    }

    @DeleteMapping
    public void eliminarEmpresa(PathVariable Long Id) {
        repositoryEmpresa.delete(Id);

    }


}