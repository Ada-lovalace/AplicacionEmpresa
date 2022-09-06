package Repository;


import Lovalace.UDEA.Empresa3.Empresa3Application;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepositoryEmpresa extends CrudRepository<Empresa3Application, Long> {
    List<Empresa3Application> findAll();
}
