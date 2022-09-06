package Domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class DomainEmpresa {

    private String Empresa;
    private String nombreEmpresa;
    private String direccionEmpresa;
    private String telefonoEmpresa;
    @Id
    private long nitEmpresa;


    public DomainEmpresa(String empresa) {
        Empresa = empresa;
    }

    public DomainEmpresa(String empresa, String nombreEmpresa, String direccionEmpresa, String telefonoEmpresa, long nitEmpresa) {
        Empresa = empresa;
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefonoEmpresa = telefonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }
}





